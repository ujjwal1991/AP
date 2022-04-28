package com.qa.opencart.pages;

import org.openqa.selenium.By;

public class CartPage {
      
	private By cartButton  = By.id("button");
	public CartPage() {
		System.out.println("Cart page");
	}
	
	public void addToCart() {
		System.out.println("add to cart");
		System.out.println("add feature is done...");
	}
}
