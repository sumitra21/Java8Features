package com.java.dp.creational.factory;

public class FactoryDP {

	public static void main(String[] args) {
		Product product = ProductFactory.getProductFactory("CLOTHING");
		product.displayProduct();
		
		Product fittness = ProductFactory.getProductFactory("FITTNESS");
		fittness.displayProduct();
		
		Product jwellery = ProductFactory.getProductFactory("JWELLERY");
		jwellery.displayProduct();
	}

}
