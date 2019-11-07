package com.java.streamapi.intermidiate.operation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java.functionalinterface.Person;

public class FlatMapExample {
	public static void main(String[] args) {
		
		List<Person> list = Arrays.asList(
				new Person("Madhav","Ghosh",35),
				new Person("Resma","Jain",28),
				new Person("Kasif","S",26),
				new Person("Sima","Panda",24),
				new Person("Smrutia","Kumar",38));
		
		list.stream()
		.flatMap(s -> Stream.of(s.getFirstName().charAt(2)))
		.forEach(p -> System.out.println(p));
		
		List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13); 
		
		 List<Integer> OddNumbers = Arrays.asList(1, 3, 5); 
		 
		 List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8); 
		 
		 List<List<Integer>> AllList = Arrays.asList(PrimeNumbers, OddNumbers,EvenNumbers);
		 System.out.println("Before Flatten the List is  :: "+AllList);
		
		 List<Integer> result = 
		 AllList.stream()
		 .flatMap(l -> l.stream())
		 .collect(Collectors.toList());
		 
		 System.out.println("After Flatten the List is  :: "+result);
		
	}
}
