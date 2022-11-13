package com.shulha.creating;

import java.util.Random;

public class ArrayCreating {
    private final static Random RANDOM = new Random();

    private int length;
    private int[] array;

    public ArrayCreating() {
        this(10);
    }

    public ArrayCreating(final int length) {
        if (length < 10) {
            return;
        }
        this.length = length;
    }

    public void setLength(final int length) {
        if (length < 10) {
            return;
        }
        this.length = length;
    }

    public int[] getRandomArray() {
        array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = RANDOM.nextInt(201) - 100;
        }

        return array;
    }
}
