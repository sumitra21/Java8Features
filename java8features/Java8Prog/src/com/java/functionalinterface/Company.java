package com.java.functionalinterface;

public class Company {
	
	private String name;
	private String address;
	private int strength;
	
	public Company(String name, String address, int strength) {
		super();
		this.name = name;
		this.address = address;
		this.strength = strength;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", address=" + address + ", strength=" + strength + "]";
	}

}
