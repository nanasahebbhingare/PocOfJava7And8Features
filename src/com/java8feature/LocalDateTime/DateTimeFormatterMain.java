package com.java8feature.LocalDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterMain {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2020, 2, 19);
		String baseISO = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println("baseISO : " + baseISO);
		String localISO = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("localISO : " + localISO);

		LocalDate baseDateParse = LocalDate.parse("20200219", DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println("baseDateParse : " + baseDateParse);
		LocalDate localDateParse = LocalDate.parse("2020-02-19", DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("localDateParse : " + localDateParse);

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		System.out.println(localDate.format(dateTimeFormatter));
	}
}
