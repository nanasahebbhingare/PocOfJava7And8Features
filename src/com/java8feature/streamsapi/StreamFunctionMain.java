package com.java8feature.streamsapi;

import java.util.Random;
import java.util.stream.Stream;

public class StreamFunctionMain {
	public static void main(String[] args) {
		// limitMethod();
		// skipMethod();
		distinctMethod();
	}

	private static void distinctMethod() {
		Stream.of(1, 2, 3, 1, 2, 3).distinct().forEach(System.out::println);
	}

	private static void skipMethod() {
		Stream.iterate(1, n -> n + 1).skip(10).limit(5).forEach(System.out::println);
	}

	private static void limitMethod() {
		Stream.generate(new Random()::nextInt).limit(10).forEach(System.out::println);
	}
}
