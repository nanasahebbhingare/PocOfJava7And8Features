package com.java7feature;

public class SuppressedExceptionMain {
	public static void main(String[] args) throws Exception {
		// Without try-with-resources
		SuppressedExceptionTest exceptionTest = null;
		try {
			exceptionTest = new SuppressedExceptionTest();
			exceptionTest.getException();
		} finally {
			exceptionTest.close();
		}
		// With try-with-resources
		try (SuppressedExceptionTest exceptionTest2 = new SuppressedExceptionTest()) {
			exceptionTest2.getException();
		}
		
		
	}
}
