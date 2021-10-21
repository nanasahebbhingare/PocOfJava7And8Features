package com.java8feature.functinalinterface;

@FunctionalInterface
public interface IChaildSecondFunctinalInterfaceTest extends IParentFunctinalInterfaceTest {
	public void display();// Override method/inheritance
	//public void show(); Error: Invalid '@FunctionalInterface' annotation; IChaildSecondFunctinalInterfaceTest is not a functional interface
}
