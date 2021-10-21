package com.java8feature.LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateMain {
	public static void main(String[] args) {
		LocalDate localDateNow = LocalDate.now();
		System.out.println("localDateNow : " + localDateNow);
		LocalDate localDateAssign = LocalDate.of(1991, 9, 18);
		System.out.println("localDateNow : " + localDateAssign);
		System.out.println("Year : " + localDateAssign.getYear() + " Month : " + localDateAssign.getMonth() + " Day : "
				+ localDateAssign.getDayOfMonth());

		System.out.println("isLeapYear : " + localDateAssign.isLeapYear());

		System.out.println("Year : " + localDateAssign.get(ChronoField.YEAR) + " Month : "
				+ localDateAssign.get(ChronoField.MONTH_OF_YEAR) + " Day : "
				+ localDateAssign.get(ChronoField.DAY_OF_MONTH));

		LocalDate parseDate = LocalDate.parse("2021-06-16");
		System.out.println(parseDate);

		System.out.println("****************************************************************");

		LocalTime localTime = LocalTime.of(12, 50, 10);
		System.out.println(localTime);
		System.out.println("Hour : " + localTime.getHour() + " Minute : " + localTime.getMinute() + " Day : "
				+ localTime.getSecond());
		System.out.println("localTime : " + LocalTime.now());

		System.out.println("****************************************************************");
		LocalDateTime localDateTimeNow = LocalDateTime.now();
		System.out.println(localDateTimeNow);
		LocalDate localDateOld = LocalDate.of(2020, 2, 19);
		LocalTime localTimeOld = LocalTime.of(12, 02, 19);
		LocalDateTime localDateTimeAssign = LocalDateTime.of(localDateOld, localTimeOld);

		System.out.println("isAfter : " + localDateTimeAssign.isAfter(localDateTimeNow));
		System.out.println("isBefore : " + localDateTimeAssign.isBefore(localDateTimeNow));
		System.out.println("isEqual : " + localDateTimeAssign.isEqual(localDateTimeNow));
		System.out.println("plusYears : " + localDateTimeAssign.plusYears(1));
		System.out.println("minusYears : " + localDateTimeAssign.minusYears(1));

	}
}
