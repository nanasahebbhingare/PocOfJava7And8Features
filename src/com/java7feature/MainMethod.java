package com.java7feature;

public class MainMethod {
	public static void main(String[] args) throws Exception {
		try (CloseResource cr = new CloseResource()) {
			cr.displayResouceData();
		}
	}
}
