package com.blockwit.learn.comaric.map;

import java.util.Arrays;

public class Map {
	private int numbers[] = new int[10];
	private String names[] = new String[10];
	private int size = 0;


	public Map() {

	}

	public void add(int key, String value) {

		if (numbers.length == size) {
			numbers = Arrays.copyOf(numbers, numbers.length + 10);
		}
		if (names.length == size) {
			names = Arrays.copyOf(names, names.length + 10);
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

	public String get(int index) {
		String s = "По заданному ключу не найдено значение";
		for (int i = 0; i < numbers.length; i++) {
			if (index == numbers[i]){
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
				String [] names1 = Arrays.copyOfRange(names, 0, i);
				String [] names2 = Arrays.copyOfRange(names, i+1, names.length);
				names = new String[names.length-1];
				for (int j = 0; j <names1.length; j++) {
					names[j] = names1[j];
				}
				for (int j = 0; j < names2.length; j++) {
					names[j+i] = names2[j];
				}
				int [] numbers1 = Arrays.copyOfRange(numbers, 0, i);
				int [] numbers2 = Arrays.copyOfRange(numbers, i+1, numbers.length);
				numbers = new int[numbers.length-1];
				for (int j = 0; j <numbers1.length; j++) {
					numbers[j] = numbers1[j];
				}
				for (int j = 0; j < numbers2.length; j++) {
					numbers[j+i] = numbers2[j];
				}
				size--;
				return;
			}
		}
		System.out.println("Заданного элемента не существует");

	}
}

