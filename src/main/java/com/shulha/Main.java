package com.shulha;

import com.shulha.creating.ArrayCreating;
import com.shulha.sorting.ArraySorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final ArrayCreating arrayCreating = new ArrayCreating(15);
        System.out.println(Arrays.toString(arrayCreating.getRandomArray()));
    }
}
