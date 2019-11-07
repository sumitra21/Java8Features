package com.java.streamapi.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningExample {

	public static void main(String[] args) {
		List<String> strs = Arrays.asList( "A","B","C","D","E","F");
		
		String result =
				strs.stream()
		.map(n -> n.concat("Hi"))
		.collect( Collectors.joining( "," ) );
		System.out.println("Result == "+ result);
		
		List<Integer> numbers = Arrays.asList( 4, 8, 15, 16, 23, 42 );
		
		String result1 =
		numbers.stream()
		.map(n -> n.toString())
		.collect(Collectors.joining("::"));
		System.out.println("Result1 == "+ result1);
		
	}

}
