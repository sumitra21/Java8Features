package com.java.streamapi.intermidiate.operation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipAndLimitEx {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		System.out.println("--------Stream elements after limiting----------");
		list.stream()
		.limit(3)
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		System.out.println("--------Stream elements after skiping----------");
		list.stream()
		.skip(2)
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}

}
