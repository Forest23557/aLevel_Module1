package com.shulha;

import com.shulha.creating.ArrayCreating;
import com.shulha.sorting.ArraySorting;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write an array length: ");

        while (!scanner.hasNextInt()) {
            System.out.println("You wrote wrong type of data! Write an array length: ");
            scanner = new Scanner(System.in);
        }
        int length = scanner.nextInt();
        while (length < 10) {
            System.out.println("You wrote wrong length (at least 10)! Write an array length: ");
            scanner = new Scanner(System.in);
            length = scanner.nextInt();
        }
        System.out.println();

        final ArrayCreating arrayCreating = new ArrayCreating(length);
        int[] randomArray = arrayCreating.getRandomArray();
        System.out.println("Your random unsorted array: ");
        System.out.println(Arrays.toString(randomArray));

        System.out.println();
        System.out.println("Choose your sorting method: ");
        System.out.println("Write '1' if you wanna sort by ascending");
        System.out.println("Write '2' if you wanna sort by descending");

        final ArraySorting arraySorting = new ArraySorting(randomArray);
        scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            System.out.println("Choose your answer from the instruction above: ");
            scanner = new Scanner(System.in);
        }
        int answer = scanner.nextInt();
        while (answer < 1 || answer > 2) {
            System.out.println("Choose your answer from the instruction above: ");
            scanner = new Scanner(System.in);
            answer = scanner.nextInt();
        }
        System.out.println();

        if (answer == 1) {
            arraySorting.ascendingSort();
        } else {
            arraySorting.descendingSort();
        }
        System.out.println("Your random sorted array: ");
        System.out.println(Arrays.toString(arraySorting.getArray()));
        System.out.println();
    }
}
