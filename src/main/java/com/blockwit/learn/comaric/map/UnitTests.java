package com.blockwit.learn.comaric.map;

import java.io.IOException;

public class UnitTests {

	public static void main(String[] args) throws IOException, InterruptedException {
		Map abc = new Map();
		abc.add(123, "Sir gay");
		abc.add(324, "tolik");
		abc.add(456, "masha");
		abc.add(678, "nikita");
		abc.add(324, "ebolik");
		abc.remove(456);

		System.out.println(abc.get(324));
		System.out.println(abc.get(456));
	}

}
