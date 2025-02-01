package com.sample.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ArrayMultiplicationUsingStream {

	public static void main(String[] args) {
	
		Integer[] inputArray = {1,2,3,4,5};
		
		List<Integer> numberList=Arrays.asList(inputArray);
		
		Optional<Integer> output=numberList.stream().reduce((a,b)->a*b);
		
		if(output.isPresent()) {
			System.out.print("Array Multiplication :"+output.get());
		}else {
			System.out.print("Value is Empty");
		}
		

	}

}
