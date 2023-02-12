package com.blockwit.learn.comaric;

import java.util.Arrays;

public class ArrayList {
    String temp[] = new String[10];
    private int size = 0;

    public void add(String element) {

        if ((temp.length == size)) {
            String[] temp1 = Arrays.copyOf(temp, temp.length + 1);
            temp = new String[temp1.length];
            temp = temp1;
            temp[temp.length - 1] = element;
        }
        temp[size] = element;
        size++;
    }

    public String getElement(int index) {
        return temp[index];
    }
}
