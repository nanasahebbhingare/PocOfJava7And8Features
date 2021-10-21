package com.java8feature.streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPartitionByMain {
	public static void main(String[] args) {
		List<Product> products = Arrays.asList(new Product("Peru", 50), new Product("Apple", 100),
				new Product("Santra", 80), new Product("Strobary", 70), new Product("Lasun", 70));

		Map<Boolean, List<Product>> mapProduct = products.stream()
				.collect(Collectors.partitioningBy(product -> product.getPrice() >= 100));
		mapProduct.forEach((key, value) -> {
			if (key.equals(true)) {
				System.out.println(value);
			} else {
				System.out.println(value);
			}
		});
	}
}
