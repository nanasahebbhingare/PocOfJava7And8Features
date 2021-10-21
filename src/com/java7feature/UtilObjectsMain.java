package com.java7feature;

import java.util.Objects;

public class UtilObjectsMain {
	public static void main(String[] args) {
		Emp emp = new Emp(1, "Nana");
		Objects.toString(emp);
		System.out.println(emp.rollNo + "_" + emp.name);
	}
}

class Emp {
	public int rollNo;
	public String name;

	public Emp(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
}
