package com.java.functionalinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class LambdaEx1 {

	public static void main(String[] args) {
		Thread th = new Thread(() -> System.out.println("Thread is Running"));
		th.start();
		
		List<Person> list = Arrays.asList(
				new Person("Madhav","Ghosh",35),
				new Person("Resma","Jain",28),
				new Person("Kasif","S",26),
				new Person("Sima","Panda",24),
				new Person("Smruti","Kumar",38));
		
		
		Collections.sort(list, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
		System.out.println("After sorting");
		
		printAllList(list, p -> p.getFirstName().startsWith("S"));

	}

	private static void printAllList(List<Person> list, Predicate<Person> predicate) {
		list.forEach(p -> {
			if(predicate.test(p))
				System.out.println("First Name "+ p.getFirstName() + " Last Name "+ p.getLastName() + " Age " + p.getAge());
		});
		
	}

}
