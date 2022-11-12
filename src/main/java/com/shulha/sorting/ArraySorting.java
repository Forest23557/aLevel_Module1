package com.shulha.sorting;

public class ArraySorting {
    private int[] array;

    public ArraySorting() {
        this(new int[10]);
    }

    public ArraySorting(final int[] array) {
        if (array == null) {
            return;
        }
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(final int[] array) {
        if (array == null) {
            return;
        }
        this.array = array;
    }

    public void ascendingSort() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void descendingSort() {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > 0 + i; j--) {
                if (array[j] > array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
}
