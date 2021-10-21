package com.java8feature.miscellaneous;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapEnhancementMain {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("India", "Delhi");
		map.put("Usa", "Washington");
		map.put("Japan", "Tokyo");
		map.put("Chaina", "Beijing");
		map.put("England", "London");

		map.forEach((contry, capital) -> System.out.println("Contry : " + contry + " Capital :" + capital));
		map.entrySet().stream().sorted(Entry.comparingByKey()).forEachOrdered(key -> System.out.println("Key :" + key));
		map.entrySet().stream().sorted(Entry.comparingByValue())
				.forEachOrdered(value -> System.out.println("Value :" + value));

		System.out.println(map.getOrDefault("Russia", "No Data"));

		map.computeIfAbsent("Spain", name -> "Marid");

		map.replaceAll((contry, capital) -> capital.toUpperCase());
		map.entrySet().stream().sorted(Entry.comparingByValue())
		.forEachOrdered(value -> System.out.println("Value :" + value));
	}
}
