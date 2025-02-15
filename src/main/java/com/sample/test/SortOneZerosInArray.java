package com.sample.test;

import java.util.Arrays;

public class SortOneZerosInArray {

	public static void main(String[] args) {
		int[] arrayNumbers = {1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1};
		 	reorderArray(arrayNumbers);
		 	for (int i = 0; i < arrayNumbers.length; i++) {
	            System.out.print(arrayNumbers[i] + " ");
	        }
		 	// or print using Arrays.toString
	        System.out.println(Arrays.toString(arrayNumbers));
	}
		
	public static void reorderArray(int[] array) {
        int left = 0, right = array.length - 1;
        
        while (left < right) {
            if (array[left] == 1) {
                left++;
            } else if (array[right] == 0) {
                right--;
            } else {
                // Swap 0 at left with 1 at right
                array[left] = 1;
                array[right] = 0;
                left++;
                right--;
            }
        }
    }
}
