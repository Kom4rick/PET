package com.blockwit.learn.comaric.map;

import com.blockwit.learn.comaric.list.ArrayList;

public class UnitTests {

	public static void main(String[] args) throws Exception {
		test_singleAdd();
		test_singleRemove();
		test_performance();
		test_singleRemove();

	}

	public static void test_performance() {
		Map map = new Map();
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 400000; i++) {
			map.add(i + "skjhddhidhihdhdhdhkdhkjdhkhd", i + "");
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Finished: " + (endTime - startTime));
	}

	public static void test_singleAdd() throws Exception {
		Map abc = new Map();
		String testKey = "324";
		String testValue = "tolik90898989";
		abc.add(testKey, testValue);
		if (!abc.get(testKey).equals(testValue)) {
			throw new Exception("Something went wrong");
		}
	}

	public static void test_singleRemove() throws Exception {
			Map abc = new Map();
			String testKey = "1";
			String testValue = "jora";
			abc.add(testKey,testValue);
			abc.remove((testKey));
		if (abc.get(testKey).equals(testKey)){
			throw new Exception("Something went wrong");
		}
	}





}
