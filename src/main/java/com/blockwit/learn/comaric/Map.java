package com.blockwit.learn.comaric;

import java.util.Arrays;

public class Map {
    int numbers [] = new int[1];
    String names [] = new String[1];
    private int size = 0;

    public void add (String element){
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+1;
        }

        if (numbers.length == size) {
            int [] temp1 = Arrays.copyOf(numbers, numbers.length + 1);
            numbers = new int[temp1.length];
            numbers = temp1;
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = i+1;
            }
        }
        if (names.length == size) {
            String[] temp1 = Arrays.copyOf(names, names.length + 1);
            names = new String[temp1.length];
            names = temp1;
            names[names.length - 1] = element;
        }
        names[size] = element;
        size++;
    }
    public String getElement(int number){
        String s = null;
        for (int i = 0; i < numbers.length; i++) {
            if (number == numbers[i]){
                return s = names[i+1];
            }
        }
        return s;
        }
    }

