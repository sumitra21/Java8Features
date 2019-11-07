package com.java.dp.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//static in nature
//Private constructor
//Thread safe
//No parameter to constructor
//Private instance of the class need to be created
public class SingletonDP {

	public static void main(String[] args) {
		/*
		 * MySinglton singleton = MySinglton.getInstance(); singleton.show();
		 * 
		 * MySinglton singleton1 = MySinglton.getInstance();
		 * System.out.println(System.identityHashCode(singleton));
		 * System.out.println(System.identityHashCode(singleton1));
		 */
		
		
		//Check for Serialization
		MySinglton singleton1 = MySinglton.getInstance();
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test.ser"));
			out.writeObject(singleton1);
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Check for Deserialization
		MySinglton singleton2 = null;
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("test.ser"));
			singleton2 = (MySinglton)in.readObject();
			in.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("After Serialization .............");
		System.out.println(System.identityHashCode(singleton1));
		System.out.println(System.identityHashCode(singleton2));
		
		
		//Check for Cloning
		MySinglton singltonBeforeClone = MySinglton.getInstance();
		MySinglton singltonAfterClone = null;
		try {
			singltonAfterClone = (MySinglton) singltonBeforeClone.clone();			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("After cloning .............");
		System.out.println(System.identityHashCode(singltonBeforeClone));
		System.out.println(System.identityHashCode(singltonAfterClone));
	}

}

class MySinglton implements Serializable,Cloneable{
	
	private static volatile MySinglton SINGLETON = null;
	
	private MySinglton() {
		
	}
	
	public static MySinglton getInstance() {
		if(SINGLETON == null) {
			synchronized (MySinglton.class) {
				if(SINGLETON == null) {
					SINGLETON = new MySinglton();
				}
			}
		}
		return SINGLETON;
	}
	
	public void show() {
		System.out.println("Singlton design pattern...");
	}
	
	//Overcome from creating new object while Deserialization, so implement readResolve()
	protected Object readResolve() { return SINGLETON; }
	
	//Overcome from cloning by override the clone method
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException();
	}
	 
}
