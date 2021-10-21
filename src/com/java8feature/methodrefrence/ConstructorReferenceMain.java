package com.java8feature.methodrefrence;

public class ConstructorReferenceMain {
	public static void main(String[] args) {
		IProductInterfece iProductInterfece = Product::new;
		Product getProduct = iProductInterfece.getProduct(1, "Nana");
		System.out.println(getProduct);
	}
}
