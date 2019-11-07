package com.core.java.prog;

import java.util.concurrent.Callable;

public class ThreadUsingCallable {

	public static void main(String[] args) {
		Thread th = new Thread();

	}

}

class Call implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		System.out.println("Callable is called");
		return null;
	}
	
}
