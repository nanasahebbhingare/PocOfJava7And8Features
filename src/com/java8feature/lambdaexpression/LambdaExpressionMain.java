package com.java8feature.lambdaexpression;

public class LambdaExpressionMain {
	public static void main(String[] args) {
		// lambdaExpressionWithoutParameter();
		// lambdaExpressionWithParameter();
		// lambdaExpressionWithMultipleParameter();
		lambdaExpressionWithMultipleParameterAndRetunValue();
	}

	private static void lambdaExpressionWithoutParameter() {
		IFunctinalInterfaceWithoutParameter iFunctinalInterface = () -> {
			System.out.println("In LambdaExpressionMain.lambdaExpressionWithoutParameter ...!!");
		};

		IFunctinalInterfaceWithoutParameter iFunctinalInterface1 = () -> System.out
				.println("In LambdaExpressionMain.lambdaExpressionWithoutParameter without {} ...!!");

		iFunctinalInterface1.show();
		iFunctinalInterface.show();
		iFunctinalInterface.display();
		iFunctinalInterface.displaySecond();
		IFunctinalInterfaceWithoutParameter.staticDisplay();
	}

	private static void lambdaExpressionWithParameter() {
		IFunctinalInterfaceWithParameter iFunctinalInterface = (input) -> {
			System.out.println("In LambdaExpressionMain.lambdaExpressionWithParameter " + input);
		};

		IFunctinalInterfaceWithParameter iFunctinalInterface1 = (input) -> System.out
				.println("In LambdaExpressionMain.lambdaExpressionWithParameter " + input);

		IFunctinalInterfaceWithParameter iFunctinalInterface2 = input -> System.out
				.println("In LambdaExpressionMain.lambdaExpressionWithParameter " + input);

		iFunctinalInterface.show("Hello");
		iFunctinalInterface1.show("Hello Second");
		iFunctinalInterface2.show("Hello Three");
	}

	private static void lambdaExpressionWithMultipleParameter() {
		IFunctinalInterfaceWithMultipleParameter functinalInterfaceWithMultipleParameter = (int a, int b) -> {
			System.out.println(a + b);
		};

		IFunctinalInterfaceWithMultipleParameter functinalInterfaceWithMultipleParameter1 = (a, b) -> {
			System.out.println(a + b);
		};

		IFunctinalInterfaceWithMultipleParameter functinalInterfaceWithMultipleParameter3 = (a, b) -> System.out
				.println(a + b);
		functinalInterfaceWithMultipleParameter.sum(5, 5);
		functinalInterfaceWithMultipleParameter1.sum(10, 5);
		functinalInterfaceWithMultipleParameter3.sum(10, 10);

	}

	private static void lambdaExpressionWithMultipleParameterAndRetunValue() {
		IFunctinalInterfaceWithMultipleParameterAndReturnValue functinalInterfaceWithMultipleParameterAndReturnValue = (
				a, b) -> {
			return a + b;
		};
		IFunctinalInterfaceWithMultipleParameterAndReturnValue functinalInterfaceWithMultipleParameterAndReturnValue2 = (
				a, b) -> a + b;
		IFunctinalInterfaceWithMultipleParameterAndReturnValue functinalInterfaceWithMultipleParameterAndReturnValue3 = (
				a, b) -> a * b;
		System.out.println(functinalInterfaceWithMultipleParameterAndReturnValue.sum(10, 10));
		System.out.println(functinalInterfaceWithMultipleParameterAndReturnValue2.sum(10, 10));
		System.out.println(functinalInterfaceWithMultipleParameterAndReturnValue3.sum(10, 10));

		IFunctinalInterfaceWithMultipleParameterAndReturnValue functinalInterfaceWithMultipleParameterAndReturnValue4 = new IFunctinalInterfaceWithMultipleParameterAndReturnValue() {
			@Override
			public int sum(int a, int b) {
				return a + b;
			}
		};
		System.out.println(functinalInterfaceWithMultipleParameterAndReturnValue4.sum(1, 2));
		IFunctinalInterfaceWithMultipleParameterAndReturnValue functinalInterfaceWithMultipleParameterAndReturnValue5 = new IFunctinalInterfaceWithMultipleParameterAndReturnValue() {
			@Override
			public int sum(int a, int b) {
				return a + b;
			}
		};
		System.out.println(functinalInterfaceWithMultipleParameterAndReturnValue5.sum(1, 2));
	}
}