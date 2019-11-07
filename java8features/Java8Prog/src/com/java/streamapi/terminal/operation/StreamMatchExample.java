package com.java.streamapi.terminal.operation;

import java.util.Arrays;
import java.util.List;

import com.java.functionalinterface.Person;

public class StreamMatchExample {

	public static void main(String[] args) {
		List<Person> list = Arrays.asList(
				new Person("Madhav","Ghosh",35),
				new Person("Resma","Jain",28),
				new Person("Kasif","S",26),
				new Person("Sima","Panda",24),
				new Person("Smrutia","Kumar",38));
		
		boolean isMatched = 
		list.parallelStream()
		.anyMatch(p -> p.getFirstName().equals("Sima"));
		System.out.println(isMatched);
		
		boolean allmatch = 
				list.stream()
				.allMatch(p -> p.getFirstName().contains("a"));
				
				System.out.println("AllMatched "+ allmatch);
	}

}
