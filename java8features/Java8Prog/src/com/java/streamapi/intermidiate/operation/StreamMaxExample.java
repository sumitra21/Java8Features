package com.java.streamapi.intermidiate.operation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMaxExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4); 
		
		Integer no = list.stream()
		.max(Comparator.naturalOrder()).get();
		
		System.out.println("Maxmum no is :: "+no);
		
		
	}

}
