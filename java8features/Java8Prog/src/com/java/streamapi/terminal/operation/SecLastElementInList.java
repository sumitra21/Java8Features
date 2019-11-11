package com.java.streamapi.terminal.operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SecLastElementInList {

	public static void main(String[] args) {
		List<String> valueList = new ArrayList<>();
		valueList.add("Joe");
		valueList.add("John");
		valueList.add("Sean");
		
		//Get the last element in list using reduce
		String str = valueList.parallelStream()
		.reduce((first, second) -> first)
		.orElse(null);
		
		//System.out.println(str);
		
		//Using skip
		long count = valueList.stream().count();
		System.out.println(str);
		
		String result = 
		valueList.parallelStream()
		.skip(count - 1)
		.findFirst()
		.get();
		System.out.println(result);
		
		List<String> resultList = 
		valueList.parallelStream()
		.skip(count-2)
		.collect(Collectors.toList());
		
		//System.out.println(resultList);
		
		String str1 = 
		valueList.parallelStream()
		.sorted(Comparator.reverseOrder())
		.filter(p -> p.startsWith("J"))
		.findFirst().get();
		
		//System.out.println(str1);
		
		
		List<String> resultList1 =
		valueList.parallelStream()
		.sorted(Comparator.reverseOrder())
		.filter(p -> p.startsWith("J"))
		.skip(count-2)
		.collect(Collectors.toList());
		System.out.println(resultList1);
	}

}
