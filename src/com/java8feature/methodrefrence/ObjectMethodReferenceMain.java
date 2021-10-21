package com.java8feature.methodrefrence;

public class ObjectMethodReferenceMain {
	public static void main(String[] args) {
		IArithmeticOpration arithmeticOpration = (a, b) -> {
			int sum = a + b;
			System.out.println("Sum : " + sum);
			return sum;
		};
		arithmeticOpration.performOperation(10, 5);
		ObjectMethodReferenceMain methodReferenceMain = new ObjectMethodReferenceMain();
		IArithmeticOpration arithmeticOprationObj = methodReferenceMain::performAddition;
		arithmeticOprationObj.performOperation(10, 10);

	}
	public Integer performAddition(int a, int b) {
		int sum = a + b;
		System.out.println("Sum : " + sum);
		return sum;
	}
}
