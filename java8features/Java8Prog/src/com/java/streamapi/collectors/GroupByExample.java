package com.java.streamapi.collectors;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.java.streamapi.intermidiate.operation.Item;

public class GroupByExample {

	public static void main(String[] args) {
		List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");
		Map<String,Long> resultMap = 
		items.stream()
		.collect(Collectors
				.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(resultMap);
		
		resultMap.entrySet()
		.stream()
		.collect(Collectors.toMap(t -> t.getKey(), t -> t.getValue()));
		
		//Items added to list
		List<Item> itemList = Arrays.asList(
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                new Item("orang", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99"))
        );

		
		//Group By name and count the item
		Map<String, Long> resultMap1 = 
		itemList.stream()
		.collect(Collectors
				.groupingBy(Item::getName, Collectors.counting()));
		
		System.out.println(resultMap1);
		
		Map<String, Integer> resultMap2 = 
				itemList.stream()
				.collect(Collectors
						.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));
		
		System.out.println(resultMap2);
		
		//group by price
		Map<BigDecimal, List<Item>> resultMap3 = 
		itemList.parallelStream()
		.collect(Collectors.groupingBy(Item::getPrice));
		
		System.out.println("ResultMap2 "+resultMap2);
		
		
		System.out.println(resultMap3);

		// group by price, uses 'mapping' to convert List<Item> to Set<String>
		Map<BigDecimal, Set<String>> resultMap4 = 
				itemList.stream()
				.collect(Collectors
						.groupingBy(Item::getPrice, Collectors.mapping(Item::getName, Collectors.toSet())));
		System.out.println(resultMap4);
		
		//Group By using Function.identity
		Map<Item, Long> resultMap5 = 
		itemList.parallelStream()
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("ResultMap5 == "+resultMap5);
		
	}

}
