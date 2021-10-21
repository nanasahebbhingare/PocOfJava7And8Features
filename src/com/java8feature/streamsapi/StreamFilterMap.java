package com.java8feature.streamsapi;

import java.util.ArrayList;
import java.util.List;

public class StreamFilterMap {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("HR");
		list.add("Marketing");
		list.add("Sales");
		
		list.stream().filter(name -> name.startsWith("M")).forEach(System.out::println);
	}
}
