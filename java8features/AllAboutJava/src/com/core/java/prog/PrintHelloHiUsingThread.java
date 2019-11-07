package com.core.java.prog;

import java.util.concurrent.atomic.AtomicBoolean;

public class PrintHelloHiUsingThread {
	

	public static void main(String[] args) {
		AtomicBoolean isPrintHi = new AtomicBoolean(true);
		AtomicBoolean isPrintHello = new AtomicBoolean(true);
		
		Thread hi = new Thread(new Hi(isPrintHi));
		hi.start();
		
		Thread hello = new Thread(new Hello(isPrintHello));
		hello.start();
		
		

	}

}

class Hi implements Runnable{
	 
	AtomicBoolean isPrintHi = new AtomicBoolean();
	AtomicBoolean isPrintHello = new AtomicBoolean();
	
	Hi(AtomicBoolean isPrintHi){
		this.isPrintHi = isPrintHi; 
	}
	
	@Override
	public void run() {
		for(int i = 0; i< 5; i++) {
			 printHi();
		}
		
	}

	private void  printHi() {
		
		boolean isTrue = isPrintHi.get();
		if(isTrue)
			System.out.println(Thread.currentThread().getName()+"::"+"Hi");
		
		isPrintHi.set(false);
	}	
}

class Hello implements Runnable{	
	AtomicBoolean isPrintHi = new AtomicBoolean();
	AtomicBoolean isPrintHello = new AtomicBoolean();
	
	Hello(AtomicBoolean isPrintHello){
		this.isPrintHello = isPrintHello;
	}
	
	@Override
	public void run() {
		for(int i = 0; i< 5; i++) {
			 printHello();
		}
	}

	private void  printHello() {
		
		boolean isTrue = isPrintHello.get();
		if(isTrue)
			System.out.println(Thread.currentThread().getName()+"::"+"Hello");
		
		isPrintHello.set(false);
	}	
}