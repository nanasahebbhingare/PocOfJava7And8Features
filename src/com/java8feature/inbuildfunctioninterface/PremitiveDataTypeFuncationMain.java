package com.java8feature.inbuildfunctioninterface;

import java.util.function.DoublePredicate;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.ToIntBiFunction;

public class PremitiveDataTypeFuncationMain {
	public static void main(String[] args) {
		// predicatePremitiveDataType();
		functionPremitiveDataType();
	}

	private static void predicatePremitiveDataType() {
		IntPredicate intPredicate = input -> input % 2 == 0;
		System.out.println(intPredicate.test(5));

		DoublePredicate doublePredicate = input -> input % 2 == 0;
		System.out.println(doublePredicate.test(18.0));

	}

	private static void functionPremitiveDataType() {
		IntFunction<String> intFunction = input -> Integer.toString(input);
		System.out.println(intFunction.apply(10));

		ToIntBiFunction<Integer, Integer> toIntBiFunction = (input1, input2) -> input1 + input2;
		System.out.println(toIntBiFunction.applyAsInt(10, 20));
	}
}
