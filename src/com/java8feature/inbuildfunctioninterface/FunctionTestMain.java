package com.java8feature.inbuildfunctioninterface;

import java.util.function.Function;

public class FunctionTestMain {
	public static void main(String[] args) {
		Student student = new Student(1, "nana");

		Function<Student, String> nameUpperCase = std -> std.getName().toUpperCase();
		System.out.println(nameUpperCase.apply(student));

		Function<String, String> nameIdentity = Function.identity();
		System.out.println(nameIdentity.apply("Nana"));

		Function<Integer, Integer> multiOpration = a -> {
			System.out.println("Multi Of Two...!!!");
			return a * 2;
		};
		System.out.println("multiOpration : " + multiOpration.apply(2));
	}
}
