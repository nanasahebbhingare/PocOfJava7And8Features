package com.java8feature.inbuildfunctioninterface;

import java.util.function.Predicate;

public class PredicateTestMain {
	public static void main(String[] args) {
		Student student = new Student(1, "Nana");

		Predicate<Student> checkName = std -> std.getName().equals("Nana");
		System.out.println("checkName : " + checkName.test(student));

		Predicate<Student> checkRollNo = std -> std.getRollNo() == 1;
		System.out.println("checkRollNo :" + checkRollNo.test(student));

		System.out.println("Predicate and :" + checkName.and(checkRollNo).test(student));

		Predicate<String> checkEquility = Predicate.isEqual("Nana");
		System.out.println(checkEquility.test("nana"));
	}
}
