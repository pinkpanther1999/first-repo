package org.fi.spring.firstspringapp;

public class ShoppingCart implements Cart{
	String nameCart;

	public String getNameCart() {
		return nameCart;
	}

	public void setNameCart(String nameCart) {
		this.nameCart = nameCart;
	}
	@Override
public void addToCart() {
	System.out.println("this is the add cart method------" + getNameCart());
}
	@Override
public void listCart() {
	System.out.println("this is the List (((((((((cart method");

}
}
