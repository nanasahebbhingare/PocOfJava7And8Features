package com.java7feature;

public class CloseResource implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("In close() JVM automatically call....");
	}

	public void displayResouceData() {
		System.out.println("In displayResouceData() ...");
	}

}
