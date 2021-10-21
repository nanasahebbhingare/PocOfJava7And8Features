package com.java8feature.streamsapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamCollectingAndThenMain {
	public static void main(String[] args) {
		List<Product> products = Arrays.asList(new Product("Peru", 50), new Product("Apple", 100),
				new Product("Santra", 80), new Product("Strobary", 70));
		String maxPriceName = products.stream()
				.collect(Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Product::getPrice)),
						(Optional<Product> product) -> product.isPresent() ? product.get().getName() : "NO DATA"));
		
		System.out.println(maxPriceName);
	}
}
