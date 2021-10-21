package com.java7feature;

import java.io.IOException;

public class SuppressedExceptionTest implements AutoCloseable {

	@Override
	public void close() throws Exception {
		throw new NullPointerException("NullPointerException: In Close...!!!");
	}

	public void getException() throws IOException {
		throw new IOException("IOException: In getException...!!!");
	}

}
