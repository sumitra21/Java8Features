package com.java.streamapi.terminal.operation;

import java.util.Arrays;
import java.util.List;

import com.java.functionalinterface.Person;

public class FindFirstExample {

	public static void main(String[] args) {
		List<Person> list = Arrays.asList(
				new Person("Madhav","Ghosh",35),
				new Person("Resma","Jain",28),
				new Person("Kasif","S",26),
				new Person("Sima","Panda",24),
				new Person("Smrutia","Kumar",38));
		
		String firstName = 
		list.parallelStream()
		.filter(p -> p.getFirstName().startsWith("S"))
		.findFirst()
		.get().getFirstName();
		System.out.println(firstName);

	}

}
