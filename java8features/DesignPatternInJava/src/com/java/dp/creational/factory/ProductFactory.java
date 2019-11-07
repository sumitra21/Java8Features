package com.java.dp.creational.factory;

public class ProductFactory {	
	public static Product getProductFactory(String str) {
		Product product = null;
		if(str.equalsIgnoreCase(CONSTANTS.CLOTHING))
			product = new Clothing();
		
		else if(str.equals(CONSTANTS.FITTNESS))
			product = new Fittness();
		
		else if(str.equals(CONSTANTS.JWELLARY))
			product = new Jwellary();
		return product;
	}

}
