package com.java8feature.defaultandstaticmethods;

public class StaticMethodImplementationMain implements IStaticMethodInInterface {
	public static void main(String[] args) {
		StaticMethodImplementationMain staticMethodImplementationMain = new StaticMethodImplementationMain();
		staticMethodImplementationMain.display();
		staticMethodImplementationMain.show();
		IStaticMethodInInterface.show();
	}

	@Override
	public void display() {
		System.out.println("In StaticMethodImplementationMain.display() ...!!");
	}

	private void show() {
		System.out.println("In StaticMethodImplementationMain.show() ...!!");
	}
}
