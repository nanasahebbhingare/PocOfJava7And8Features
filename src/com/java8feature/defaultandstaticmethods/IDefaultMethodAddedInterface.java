package com.java8feature.defaultandstaticmethods;

public interface IDefaultMethodAddedInterface {

	public void display();

	public int addNum();

	public default void show() {
		System.out.println("In IDefaultMethodAddedInterface.show() default method....!!");
	}
}
