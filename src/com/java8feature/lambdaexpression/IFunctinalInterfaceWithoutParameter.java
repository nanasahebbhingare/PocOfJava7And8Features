package com.java8feature.lambdaexpression;

@FunctionalInterface
public interface IFunctinalInterfaceWithoutParameter {
	void show();

	default void display() {
		System.out.println("In IFunctinalInterface.display ...!!!");
	}

	default void displaySecond() {
		System.out.println("In IFunctinalInterface.displaySecond ...!!!");
	}

	static void staticDisplay() {
		System.out.println("In IFunctinalInterface.staticDisplay ...!!!");
	}
}
