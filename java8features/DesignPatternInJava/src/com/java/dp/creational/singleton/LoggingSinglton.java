package com.java.dp.creational.singleton;

public class LoggingSinglton {

	public static void main(String[] args) {
		Logging.getInstance().display();

	}

}

class Logging{
	private static volatile Logging INSTANCE = null;
	
	private Logging() {
		
	}
	
	public void display() {
		System.out.println("Singleton is called");
	}
	
	public static Logging getInstance() {
		if(null == INSTANCE) {
			synchronized (Logging.class) {
				if(null == INSTANCE) {
					INSTANCE = new Logging();
				}
			}
		}		
		return INSTANCE;
	}
}
