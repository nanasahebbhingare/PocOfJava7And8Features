package com.java8feature.defaultandstaticmethods;

public class AbstractClassExtendsMain extends AbstractClassInstanceVariable {
	Integer i;

	public AbstractClassExtendsMain(Integer i) {
		super(i);
		this.i = i;
		System.out.println("In AbstractClassExtendsMain.constructor...!!!");
	}

	public static void main(String[] args) {
		AbstractClassExtendsMain abstractClassExtendsMain = new AbstractClassExtendsMain(10);
		System.out.println("Value Of i :" + abstractClassExtendsMain.i);
	}
}
