package com.java8feature.streamsapi;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFlatMapMain {
	public static void main(String[] args) {
		Stream<String> mapStream = Stream.of("Nana", "Haridas", "Bhingare");
		mapStream.map(name -> name.split("")).flatMap(Arrays::stream).forEach(System.out::println);
	}
}
