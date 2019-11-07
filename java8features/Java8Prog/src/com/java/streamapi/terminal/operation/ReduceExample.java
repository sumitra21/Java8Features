package com.java.streamapi.terminal.operation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class ReduceExample {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("GFG", "Geeks", "for", 
                "GeeksQuiz", "GeeksforGeeks");
		
		String longestStr = words.stream()
		.reduce("", (s1,s2) -> s1.length() > s2.length()?s1:s2)
		;		
		System.out.println(longestStr);
		
		List<Integer> list = Arrays.asList(2,3,4,5,1);
		
		Integer sum = list.stream()
		.reduce(2, (n1,n2) -> n1+n2);
		
		System.out.println("Total sum is :: "+sum);
		
		List<String> combine = Arrays.asList("Geeks", "for", 
                "Geeks");
		
		String combinedWord = combine.stream()
		.reduce((s1,s2) -> s1+"_"+s2).get();
		
		System.out.println("Combined Word is :: "+combinedWord);
		
		//Range
		int no = IntStream.range(2, 6)
		.reduce((n1,n2) -> n1+n2)
		.orElse(-1);
		
		System.out.println("Sum == "+ no);
		
		
		

	}

}
