package com.java8feature.defaultandstaticmethods;

public class DefaultMethodMain implements IDefaultMethodAddedInterface {
	int sum = 0;

	public static void main(String[] args) {
		DefaultMethodMain defaultMethodMain = new DefaultMethodMain();
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
}
