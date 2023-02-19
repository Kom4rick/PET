package com.blockwit.learn.comaric.map;

import java.util.Arrays;

public class Map {
	private int numbers[] = new int[1];
	private String names[] = new String[1];
	private int size = 0;

	public Map(int [] numbers, String[] names){
		this.names = names;
		this.numbers = numbers;
	}
	public Map() {

	}

	public void add(int key, String value) {

		if (numbers.length == size) {
			numbers = Arrays.copyOf(numbers, numbers.length + 10);
		}
		if (names.length == size) {
			names = Arrays.copyOf(names, names.length + 10);
			names[names.length - 1] = value;
		}
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == key){
				names[i] = value;
			}
		}
		numbers[size] = key;
		names[size] = value;
		size++;
	}

	public String get(int number) {
		String s = null;
		for (int i = 0; i < numbers.length; i++) {
			if (number == numbers[i]){
				return names[i];
			}
		}
		return s;
	}
	public void remove(int index){
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == index){
				numbers[i] = 0;
				names[i] = null;
			}
		}
	}
}

