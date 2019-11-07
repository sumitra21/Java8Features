package com.java.streamapi.intermidiate.operation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c");
			
		
		//sorted in natural order
		List<String> sorted = 
		list.parallelStream()
		.sorted() // same as sorted(Comparator.naturalOrder())
		.collect(Collectors.toList());
		
		System.out.println(sorted);
		
		//sorted in reverse order
		List<String> revsorted = 
		list.parallelStream()
		.sorted(Comparator.reverseOrder())
		.collect(Collectors.toList());
		
		System.out.println(revsorted);
		
		//Sort By Age
		List<User> users = Arrays.asList(
						            new User("C", 30),
						            new User("D", 40),
						            new User("A", 10),
						            new User("B", 20),
						            new User("E", 50));
		
		//Using comparator -- Sort By Age
		users.parallelStream() .sorted((o1,o2) -> o1.getAge() -
		  o2.getAge()) .collect(Collectors.toList()) .forEach(p ->
		  System.out.println(p.getName() + " :: "+p.getAge()));
		
		System.out.println("==============================");
		  
		//Using comparator.comparingInt 
		users.stream()
		  .sorted(Comparator.comparingInt(p -> p.getAge()))
		  .collect(Collectors.toList()) .forEach(p -> System.out.println(p.getName() +
		  " :: "+p.getAge()));
		 
		System.out.println("==============================");
		
		  //Sort By Age in reverse order		
		  users.stream() .sorted(Comparator.comparingInt(User::getAge) .reversed())
		  .collect(Collectors.toList()) .forEach(p -> System.out.println(p.getName() +
		  " :: "+p.getAge()));
	  
	  System.out.println("==============================");	 
		
		//Sort By Name
		users.parallelStream()
		.sorted(Comparator.comparing(User::getName))
		.collect(Collectors.toList())
		.forEach(p -> System.out.println(p.getName() + " :: "+p.getAge()));

	}

}

class User{
	private String name;
	private int age;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
