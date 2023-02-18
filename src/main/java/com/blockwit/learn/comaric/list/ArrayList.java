package com.blockwit.learn.comaric.list;

import java.util.Arrays;

public class ArrayList {
	private String temp[];
	private int size = 0;

	public ArrayList(int length) {
		temp = new String[length];
	}

	public ArrayList() {
		this(10);
	}

	public void add(String element) {
		if (temp.length == size) {
			temp = Arrays.copyOf(temp, temp.length + temp.length);
			temp[temp.length - 1] = element;
		}
		temp[size] = element;
		size++;
	}

	public String get(int index) {
		return temp[index];
	}

}

