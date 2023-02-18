package com.blockwit.learn.comaric.map;

import java.io.IOException;

public class UnitTests {

	public static void main(String[] args) throws IOException, InterruptedException {
		Map abc = new Map();
		abc.add("petya");
		abc.add("vasiya");
		abc.add("yulya");
		abc.add("lox");
		System.out.println(abc.getElement(10));
	}

}
