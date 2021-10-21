package com.java8feature.streamsapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("HR");
		list.add("Marketing");
		list.add("Sales");

		Stream<String> depStream = list.stream();
		depStream.forEach(System.out::println);

		Stream<String> streamApi = Stream.of("Nana", "Haridas", "Bhingare");
		streamApi.forEach(System.out::println);

		Stream<String> parellelStream = list.parallelStream();
		parellelStream.forEach(System.out::println);

		Stream<String> emptyStream = Stream.empty();
		emptyStream.forEach(System.out::println);
	}
}
