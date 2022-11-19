package com.shulha.sorting;

import com.shulha.creating.ArrayCreating;

public class ArraySorting {
    private int[] array;

    public ArraySorting(final int length) {
        if (length < 10) {
            return;
        }
        this.array = new ArrayCreating(length).getRandomArray();
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

    public void toCube(int step) {
        if (step < 1) {
            return;
        }

        for (int i = step - 1; i < array.length; i += step) {
            double number = array[i];
            array[i] = (int) Math.pow(number, 3.0d);
        }
    }

    public void ascendingBubbleSort() {
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

    public void descendingBubbleSort() {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] > array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    public void ascendingInsertionSorting() {
        for (int j = 1; j < array.length; j++) {
            int insertionTarget = array[j];
            int index = j - 1;

            while (index >= 0 && array[index] > insertionTarget) {
                array[index + 1] = array[index];
                index--;
            }

            array[index + 1] = insertionTarget;
        }
    }

    public void descendingInsertionSorting() {
        for (int j = 1; j < array.length; j++) {
            int insertionTarget = array[j];
            int index = j - 1;

            while (index >= 0 && array[index] < insertionTarget) {
                array[index + 1] = array[index];
                index--;
            }

            array[index + 1] = insertionTarget;
        }
    }

    private int findingBoundAndAscendingSort(final int begin, final int end, final int[] array) {
        int pivot = array[end];
        int indexOfPivot = begin - 1;

        for (int j = begin; j < end; j++) {
            if (array[j] < pivot) {
                int temp = array[indexOfPivot + 1];
                array[indexOfPivot + 1] = array[j];
                array[j] = temp;

                indexOfPivot ++;
            }
        }

        indexOfPivot++;

        int temp = array[indexOfPivot];
        array[indexOfPivot] = pivot;
        array[end] = temp;

        return indexOfPivot;
    }

    private int findingBoundAndDescendingSort(final int begin, final int end, final int[] array) {
        int pivot = array[end];
        int indexOfPivot = begin - 1;

        for (int j = begin; j < end; j++) {
            if (array[j] > pivot) {
                int temp = array[indexOfPivot + 1];
                array[indexOfPivot + 1] = array[j];
                array[j] = temp;

                indexOfPivot ++;
            }
        }

        indexOfPivot++;

        int temp = array[indexOfPivot];
        array[indexOfPivot] = pivot;
        array[end] = temp;

        return indexOfPivot;
    }

    private void ascendingQuickSort(final int begin, final int end, final int[] array) {
        if (begin < end) {
            int pivot = findingBoundAndAscendingSort(begin, end, array);
            ascendingQuickSort(begin, pivot - 1, array);
            ascendingQuickSort(pivot + 1, end, array);
        }
    }

    private void descendingQuickSort(final int begin, final int end, final int[] array) {
        if (begin < end) {
            int pivot = findingBoundAndDescendingSort(begin, end, array);
            descendingQuickSort(begin, pivot - 1, array);
            descendingQuickSort(pivot + 1, end, array);
        }
    }

    public void usingAscendingQuickSort() {
        ascendingQuickSort(0, array.length - 1, array);
    }

    public void usingDescendingQuickSort() {
        descendingQuickSort(0, array.length - 1, array);
    }
}
