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
	public void insert (int index, String element ){
		if (index > size){
			throw new ArrayIndexOutOfBoundsException();
		}
		for (int i = 0; i < temp.length; i++) {
			if (i == index){
				String[] tmp = Arrays.copyOfRange(temp, 0, i);
				String[] tmp1 = Arrays.copyOfRange(temp, i+1, temp.length);
				temp[i] = element;
				for (int j = 0; j < tmp.length; j++) {
					temp[j] = tmp[j];
				}
				for (int j = 0; j < tmp1.length; j++) {
					temp[j+i+1] = tmp1[j];
				}
			}
		}
	}
	public int size(){
		return size;
	}


}

