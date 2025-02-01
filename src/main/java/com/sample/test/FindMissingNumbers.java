package com.sample.test;

import java.util.HashSet;
import java.util.Set;

public class FindMissingNumbers {

	public static void main(String[] args) {
		allMissingNumbers();
		int[] array = {1, 2, 4, 5, 6, 7, 10};
        System.out.println("\nThe first missing number is: " + findFirstMissing(array));
	}
	public static void allMissingNumbers() {
		int[] array = {1, 2, 4, 6, 7, 10};
        int min = array[0];
        int max = array[array.length - 1];

        Set<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }

        System.out.println("Missing numbers:");
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                System.out.print(i + " ");
            }
        }
	}
	public static int findFirstMissing(int[] array) {
        int expectedNumber = 1; // Starting from 1

        for (int num : array) {
            if (num != expectedNumber) {
                return expectedNumber;
            }
            expectedNumber++;
        }

        // If no missing number is found within the range
        return expectedNumber;
    }

}
