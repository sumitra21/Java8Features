package com.core.java.prog;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx {

	public static void main(String[] args) {
		List<Emp> list = Arrays.asList(new Emp("101","Ramesh",35),
				new Emp("102","Raman",25),
				new Emp("103","Raghab",17));
		
		Collections.sort(list, new NameComparator());
		
		Collections.sort(list, Comparator.comparing(Emp::getName).thenComparing(Emp::getAge));
		
		list.forEach(p -> System.out.println(p.getName() + " :: "+ p.getAge()));

	}

}

class Emp{
	private String id;
	private String name;
	private int age;
	
	public Emp(String id,String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

class NameComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp s1, Emp s2) {		
		return s1.getName().compareTo(s2.getName());
	}
	
}

class AgeComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp s1, Emp s2) {		
		return s1.getAge()-s2.getAge();
	}
	
}
