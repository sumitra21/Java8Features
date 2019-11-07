package com.java.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaUsingPredicate {

	public static void main(String[] args) {

		List<Person> list = Arrays.asList(
				new Person("Madhav","Ghosh",35),
				new Person("Resma","Jain",28),
				new Person("Kasif","S",26),
				new Person("Sima","Panda",24),
				new Person("Smruti","Kumar",38));
		
		printAllListConditionally(list, p -> p.getAge() > 30);
	}

	private static void printAllListConditionally(List<Person> list, Predicate<Person> predicate) {
		list.forEach(p -> {
			if(predicate.test(p))
				System.out.println("First Name "+ p.getFirstName() + " Last Name "+ p.getLastName() + " Age " + p.getAge());
		});
	}

}


