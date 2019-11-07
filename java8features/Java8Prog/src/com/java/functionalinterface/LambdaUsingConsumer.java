package com.java.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaUsingConsumer {

	public static void main(String[] args) {
		
		List<Person> list = Arrays.asList(
				new Person("Madhav","Ghosh",35),
				new Person("Resma","Jain",28),
				new Person("Kasif","S",26),
				new Person("Sima","Panda",24),
				new Person("Smruti","Kumar",38));
		
		List<Company> clist = Arrays.asList(
				new Company("Infy","Ecity",6000),
				new Company("Wipro","Ecity",3000),
				new Company("MMT","Marathalli",300),
				new Company("Sears","ETV",200),
				new Company("TCS","Whitefield",4000));
		
		
		
		//Using Consumer Functional Interface
		performTheListConditionally(list, p -> p.getAge() > 27, p -> System.out.println("First Name  ::: "+p.getFirstName()));
		
		//Using BiConsumer Functional Interface -- Accept two args but return nothing
		performConditionallyTwoArgs(list, p ->  p.getAge() > 27, (p,q) -> System.out.println(p.getFirstName() + " is working in " + q.getName()));
										  
										  
		

	}

	

	private static void performConditionallyTwoArgs(List<Person> list, Predicate<Person> predicate, BiConsumer<Person, Company> biconsumer) {
		list.forEach(p -> {
			//if(predicate.test(p))
				//biconsumer.accept(p);
		});
		
	}

	private static void performTheListConditionally(List<Person> list, Predicate<Person> predicate, Consumer<Person> consumer) {
		list.forEach(p -> {
			if(predicate.test(p))
				consumer.accept(p);
		});
		
	}

}
