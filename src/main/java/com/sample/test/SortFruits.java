package com.sample.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortFruits {

	public static void main(String[] args) {
		 List<String> fruits = Arrays.asList("Banana", "Apple", "Mango", "Orange", "Grapes");

	        // Sorting the list of fruits using Stream API
	        List<String> sortedFruits = fruits.stream().sorted().collect(Collectors.toList());

	        // Printing the sorted list of fruits
	        System.out.println("Sorted Fruits: " + sortedFruits);	

	}

}
