package com.java8feature.functinalinterface;

@FunctionalInterface
public interface IFunctinalInterfaceTest {
	public void display();

	public default void showSum() {
		printSum(10);
	}

	public static void printSum(int sum) {
		System.out.println("Sum Is : " + sum);
	}
}
