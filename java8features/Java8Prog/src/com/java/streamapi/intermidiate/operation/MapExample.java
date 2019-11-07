package com.java.streamapi.intermidiate.operation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,4,5,7,8,15);
		
		list.stream()
		.map(p -> p * 5)
		.forEach(p -> System.out.println(p));
		
		List<Integer>  result = list.stream()
								.map(p -> p/3)
								.collect(Collectors.toList());
		
		System.out.println(result);
		
		List<String> strList = Arrays.asList("Suman", "Sarita", "Laxmi", "Rajesh");
		
		strList.stream()
		.map(s -> s.toUpperCase())
		.forEach(p -> System.out.println(p));
		
		List<String> resultList = strList.stream()
							  .map(s -> s.concat("map"))
							  .collect(Collectors.toList());
		
		System.out.println(resultList);
		
		List<Integer> lenList = strList.stream()
				  				.map(s -> s.length())
				                .collect(Collectors.toList());
		
		System.out.println(lenList);
		
	}

}
