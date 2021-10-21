package com.java8feature.methodrefrence;

import java.util.ArrayList;
import java.util.List;

public class ClassMethodReferenceMain {
	public static void main(String[] args) {
		List<String> dataList = new ArrayList<String>();
		dataList.add("One");
		dataList.add("Two");
		dataList.add("Three");
		dataList.add("Four");
		dataList.add("Five");

		dataList.forEach(System.out::println);
		
		dataList.forEach(str -> System.out.println(str));
	}
}
