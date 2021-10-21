package com.java8feature.inbuildfunctioninterface;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierTestMain {
	public static void main(String[] args) {
		Supplier<Integer> getMonthDay = () -> LocalDate.now().getDayOfMonth();
		System.out.println(getMonthDay.get());

		Supplier<String> getDayNAme = () -> LocalDate.now().getDayOfWeek().name();
		System.out.println(getDayNAme.get());
	}
}
