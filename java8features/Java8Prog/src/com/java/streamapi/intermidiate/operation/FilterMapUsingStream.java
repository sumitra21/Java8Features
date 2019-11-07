package com.java.streamapi.intermidiate.operation;

import java.util.HashMap;
import java.util.Map;

public class FilterMapUsingStream {

	public static void main(String[] args) {
		Map<Integer, String> animalMap = new HashMap<Integer, String>();
		animalMap.put(1, "Lion");
		animalMap.put(2, "Tiger");
		animalMap.put(3, "Rino");
		
		System.out.println("Using Lambda.......");
		iterateUsingLambda(animalMap);
		
		System.out.println("Using Stream.........");
		iterateUsingStream(animalMap);
		
		
		
	}
	public static void iterateUsingLambda(Map<Integer, String> map) {
		map.forEach((k,v) -> System.out.println(k+" "+v));
	}
	
	public static void iterateUsingStream(Map<Integer, String> map) {
		map.entrySet()
		.stream()
		.forEach(e -> System.out.println(e.getKey()+" "+e.getValue()));
	}

}
