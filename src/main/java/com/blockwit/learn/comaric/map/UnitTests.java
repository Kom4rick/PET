package com.blockwit.learn.comaric.map;

import java.io.IOException;

public class UnitTests {

	public static void main(String[] args) throws IOException, InterruptedException {

		Map abc = new Map();
		abc.add(123, "serega");
		abc.add(324, "tolik");
		abc.add(456, "masha");
		abc.add(678, "nikita");
		System.out.println(abc.get(324));
		abc.add(324, "TOLIK");
		abc.add(111,"dima");
		abc.remove(456);
		System.out.println(abc.get(324));
		System.out.println(abc.get(456));
		abc.add(456, "o5 masha");
		System.out.println(abc.get(456));
		//abc.remove(666);
		System.out.println(abc.get(666));

	}

}
