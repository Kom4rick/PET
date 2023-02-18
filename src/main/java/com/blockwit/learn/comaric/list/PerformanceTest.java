package com.blockwit.learn.comaric.list;

public class PerformanceTest {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		ArrayList a = new ArrayList();
		for (int i = 0; i < 1_000_000; i++) {
			a.add("");
		}
		long finishTime = System.currentTimeMillis();
		System.out.println(finishTime - startTime);
	}

}
