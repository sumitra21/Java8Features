package com.java.streamapi.intermidiate.operation;

import java.util.Arrays;
import java.util.List;

import com.java.functionalinterface.Person;

public class MapToIntandSumExample {

	public static void main(String[] args) {
		List<Person> list = Arrays.asList(
				new Person("Madhav","Ghosh",35),
				new Person("Resma","Jain",28),
				new Person("Kasif","S",26),
				new Person("Sima","Panda",24),
				new Person("Smrutia","Kumar",38));
		
		
		// MapToInt and sum Example
		int sum = 
		list.parallelStream()
		.mapToInt(p -> p.getAge())
		.sum();		
		System.out.println(sum);

	}

}
