package com.java7feature;

public class ReThrowExceptionMain {
	public static void main(String[] args) throws FirstException, SecondException {
		String str = "first";
		try {
			if (str.equalsIgnoreCase("first")) {
				throw new FirstException();
			} else {
				throw new SecondException();
			}
		} catch (Exception e) {
			System.out.println("In Exception...!!!");
			throw e;
		}
	}
}

class FirstException extends Exception {

}

class SecondException extends Exception {

}