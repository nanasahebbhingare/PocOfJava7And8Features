package com.java8feature.inbuildfunctioninterface;

import java.util.function.Consumer;

public class ConsumerTestMain {
	public static void main(String[] args) {
		Consumer<String> consumer = input -> System.out.println(input.toUpperCase());
		consumer.accept("NANA");

		Consumer<String> consumerAppend = input -> System.out.println(input);
		consumerAppend.accept("Hello ");
		
		consumerAppend.andThen(consumer).accept("hi");
	}
}
