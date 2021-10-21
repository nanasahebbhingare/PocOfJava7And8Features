package com.java8feature.defaultandstaticmethods;

public class DefaultMethodImplementationMain implements IDefaultMethodAddedInterface,IDefaultMethodAddedInterface1{
	int sum = 0;
	public static void main(String[] args) {
		DefaultMethodImplementationMain defaultMethodMain = new DefaultMethodImplementationMain();
		defaultMethodMain.addNum();
		defaultMethodMain.display();
		defaultMethodMain.show();
	}

	@Override
	public void display() {
		System.out.println("Sum Of Num : " + sum);
	}

	@Override
	public int addNum() {
		sum = 10 + 10;
		return sum;
	}

	@Override
	public void show() {
		IDefaultMethodAddedInterface.super.show();
		IDefaultMethodAddedInterface1.super.show();
	}
	
}
