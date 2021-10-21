package com.java8feature.methodrefrence;

public class StaticMethodReferenceMain {
	public static void main(String[] args) {
		IArithmeticOpration arithmeticOpration = (a, b) -> {
			int sum = a + b;
			System.out.println("Sum : " + sum);
			return sum;
		};
		arithmeticOpration.performOperation(10, 5);
		IArithmeticOpration arithmeticOprationStatic = StaticMethodReferenceMain::performAddition;
		arithmeticOprationStatic.performOperation(10, 10);
	}

	private static Integer performAddition(int a, int b) {
		int sum = a + b;
		System.out.println("Sum : " + sum);
		return sum;
	}
}
