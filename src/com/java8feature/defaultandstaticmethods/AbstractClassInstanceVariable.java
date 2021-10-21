package com.java8feature.defaultandstaticmethods;

public abstract class AbstractClassInstanceVariable {
	public Integer i;

	public AbstractClassInstanceVariable(Integer i) {
		this.i = i;
		System.out.println("In AbstractClassInstanceVariable.constructor....!!!");
	}

	static {
		System.out.println("In AbstractClassInstanceVariable.static block");
	}

	{
		System.out.println("In AbstractClassInstanceVariable.instance block");
	}

}
