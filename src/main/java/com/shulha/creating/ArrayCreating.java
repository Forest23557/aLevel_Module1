package com.shulha.creating;

import java.util.Random;

public class ArrayCreating {
    private final static Random RANDOM = new Random();

    private int length;
    private int[] array;

    public ArrayCreating() {
        this(10);
    }

    public ArrayCreating(int length) {
        if (length < 10) {
            return;
        }
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length < 10) {
            return;
        }
        this.length = length;
    }

    public void setArray(int[] array) {
        if (array == null) {
            return;
        }
        this.array = array;
    }

    public int[] getRandomArray() {
        array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = RANDOM.nextInt(201) - 100;
        }

        return array;
    }
}
