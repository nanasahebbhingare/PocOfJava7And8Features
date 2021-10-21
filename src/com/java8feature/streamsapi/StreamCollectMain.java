package com.java8feature.streamsapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectMain {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("HR");
		list.add("Marketing");
		list.add("Sales");

		List<String> startWithList = list.stream().filter(dep -> dep.startsWith("S")).collect(Collectors.toList());
		System.out.println(startWithList);

		Long startWithLong = list.stream().filter(dep -> dep.startsWith("S")).collect(Collectors.counting());
		System.out.println(startWithLong);
		
		
	}
}
