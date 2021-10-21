package com.java8feature.streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupingByMain {
	public static void main(String[] args) {
		List<Product> products = Arrays.asList(new Product("Peru", 50), new Product("Apple", 100),
				new Product("Santra", 80), new Product("Strobary", 70), new Product("Lasun", 70));
		Map<Integer, List<Product>> mapProduct = products.stream().collect(Collectors.groupingBy(Product::getPrice));
		mapProduct.forEach((price, product) -> System.out.println("Price : " + price + " " + product));
	}
}
