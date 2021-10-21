package com.java8feature.streamsapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTraversableMain {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("HR");
		list.add("Marketing");
		list.add("Sales");

		Stream depStream = list.stream();
		depStream.forEach(System.out::println);
		depStream.forEach(System.out::println);// Exception in thread "main"
												// java.lang.IllegalStateException:
												// stream has already been
												// operated upon or closed

	}
}
