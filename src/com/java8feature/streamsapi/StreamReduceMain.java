package com.java8feature.streamsapi;

import java.util.stream.Stream;

public class StreamReduceMain {
	public static void main(String[] args) {
		System.out.println(Stream.iterate(1, n -> n + 1).limit(10).reduce((a, b) -> a + b).get());
	}
}
