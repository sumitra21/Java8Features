package com.java.streamapi.intermidiate.operation;

import java.util.Arrays;
import java.util.List;

import com.java.functionalinterface.Person;

public class FilterExample {

	public static void main(String[] args) {
		List<Person> list = Arrays.asList(
				new Person("Madhav","Ghosh",35),
				new Person("Resma","Jain",28),
				new Person("Kasif","S",27),
				new Person("Sima","Gupta",24),
				new Person("Smruti","Kumar",38));
		
		list.stream()
		.filter(p -> p.getAge() % 2 == 0)
		.forEach(p -> System.out.println(p.getFirstName()));
		
		list.stream()
		.filter(p -> p.getLastName().startsWith("G"))
		.forEach(p -> System.out.println(p.getFirstName() + " ::: "+ p.getLastName()));
		
		
		list.stream()
		.filter(p -> p.getLastName().startsWith("G"))
		.forEach(System.out::println)
		;
		
		long count = list.stream()
					.filter(p -> p.getLastName().startsWith("G"))
					.count();
		
		System.out.println(count);
		
		list.stream()
		.filter(p -> p.getLastName().startsWith("G"))
		.forEachOrdered(p -> System.out.println(p.getFirstName() + " :: "+p.getLastName()));
		
		//Distinct() use
		System.out.println("Distinct() used....");
		list.parallelStream()
		.distinct()
		.forEach(p -> System.out.println(p.getFirstName()));
		
	}

}
