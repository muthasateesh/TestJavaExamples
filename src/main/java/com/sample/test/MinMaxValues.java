package com.sample.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class MinMaxValues {

	public static void main(String[] args) {
		 int[] array = {110000, 120000, 90000, 150000, 130000, 140000, 70000, 160000, 180000};
	        findMinMax(array);
	        // or using min() and max()
	        // Finding the minimum value using Stream API
	        List<Integer> list=Arrays.asList(110000, 120000, 90000, 150000, 130000, 140000, 70000, 160000, 180000);
	        Optional<Integer> min = list.stream().min(Integer::compareTo);
	        // Finding the maximum value using Stream API
	        OptionalInt max = Arrays.stream(array).max();

	        if (min.isPresent() && max.isPresent()) {
	            System.out.println("Minimum value: " + min.get());
	            System.out.println("Maximum value: " + max.getAsInt());
	        } else {
	            System.out.println("Array is empty.");
	        }

	}
	public static void findMinMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }

        int min = array[0];
        int max = array[0];

        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }

}
