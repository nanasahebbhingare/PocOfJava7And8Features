package com.java8feature.inbuildfunctioninterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorTestMain {
	public static void main(String[] args) {
		Student student = new Student(1, "Nana");
		UnaryOperator<Student> nameUpperCase = std -> {
			std.setName(std.getName().toUpperCase());
			return std;
		};
		System.out.println("nameUpperCase : " + nameUpperCase.apply(student));
	}
}
