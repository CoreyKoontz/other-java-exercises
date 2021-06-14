package com.codewithmosh;

public class Array {

    // initializing items array
    private int[] items;
    private int count;

    //Constructor:
    public Array(int length) {
        items = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
