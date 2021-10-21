package com.java8feature.optinal;

import java.util.Optional;

public class OptionalUtilityUse {
	public static void main(String[] args) {
		optionalUtility();
	}

	public static void optionalUtility() {
		Optional<String> empty = Optional.empty();
		System.out.println(empty);

		String[] str = new String[5];
		str[1] = "Nanasaheb Bhingare";

		Optional<String> value = Optional.of(str[1]);
		System.out.println(value);
		Optional<String> nullValue = Optional.ofNullable(str[0]);
		nullValue.ifPresent(System.out::println);
		System.out.println(nullValue.orElse("No Value"));

		str[2] = "Nanasaheb Bhingare";
		Optional<String> optionValue = Optional.of(str[2]);
		System.out.println("map " + optionValue.map(String::toUpperCase));
		System.out.println("filter " + optionValue.filter(s -> s.equals("NANA")));
		System.out.println("isPresent " + optionValue.isPresent());

		optionValue.ifPresent(s -> System.out.println("ifPresent " + s));

	}
}
