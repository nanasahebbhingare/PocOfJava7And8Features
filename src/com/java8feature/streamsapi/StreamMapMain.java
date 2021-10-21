package com.java8feature.streamsapi;

import java.util.ArrayList;
import java.util.List;

public class StreamMapMain {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Nana");
		list.add("Haridas");
		list.add("Bhingare");

		list.stream().map(name -> name.toUpperCase()).forEach(System.out::println);
	}
}
