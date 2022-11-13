package com.shulha.lock;

import java.util.Arrays;

public class Lock {
    private final int[] array;

    public Lock(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        if (array == null) {
            return null;
        } else {
            return array.clone();
        }
    }

    public void printArray() {
        System.out.println(Arrays.toString(array));
    }
}
