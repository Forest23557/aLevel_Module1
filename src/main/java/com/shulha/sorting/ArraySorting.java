package com.shulha.sorting;

import com.shulha.creating.ArrayCreating;

public class ArraySorting {
    private int length;
    private int[] array;

    public ArraySorting(final int length) {
        if (length < 10) {
            return;
        }
        this.length = length;
        this.array = new ArrayCreating(length).getRandomArray();
    }

    public int[] getArray() {
        if (array == null) {
            return null;
        }
        return array;
    }

    public void setArray(final int[] array) {
        if (array == null) {
            return;
        }
        this.array = array;
        this.length = array.length;
    }

    public void toCube(int step) {
        if (step < 1) {
            return;
        }

        for (int i = step - 1; i < length; i += step) {
            double number = array[i];
            array[i] = (int) Math.pow(number, 3.0d);
        }
    }

    public void ascendingSort() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void descendingSort() {
        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j > 0 + i; j--) {
                if (array[j] > array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
}
