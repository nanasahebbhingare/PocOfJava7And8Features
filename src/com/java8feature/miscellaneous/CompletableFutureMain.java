package com.java8feature.miscellaneous;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureMain {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// runSyncMethod();
		supplyAsyncMethod();
	}

	private static void runSyncMethod() throws InterruptedException, ExecutionException {
		CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> {
			try {
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Running in runAsync()... seprate thread");
			} catch (InterruptedException ie) {
				throw new IllegalStateException(ie);
			}
		});
		System.out.println("runAsync blocking 1...");
		completableFuture.get();
		System.out.println("runAsync blocking 2...");
	}

	private static void supplyAsyncMethod() throws InterruptedException, ExecutionException {
		CompletableFuture<String> completableFutureSupplyAsync = CompletableFuture.supplyAsync(() -> {
			try {
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Running in supplyAsync()... seprate thread");
			} catch (InterruptedException ie) {
				throw new IllegalStateException(ie);
			}
			return "Nana";
		});
		System.out.println("supplyAsync blocking 1...");
		String result = completableFutureSupplyAsync.get();
		System.out.println("supplyAsync blocking 2..." + result);

		CompletableFuture<Integer> completableFutureThenApply = completableFutureSupplyAsync.thenApply(name -> {
			try {
				TimeUnit.SECONDS.sleep(2);
				System.out.println("Running in thenApply()... seprate thread");
			} catch (InterruptedException ie) {
				throw new IllegalStateException(ie);
			}
			return 10;
		});
		System.out.println("thenApply blocking 1...");
		int value = completableFutureThenApply.get();
		System.out.println("thenApply blocking 2..." + value);		
	}
}
