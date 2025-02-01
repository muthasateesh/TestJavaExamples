package com.sample.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighest {

	public static void main(String[] args) {
	
		List<Integer> numList=Arrays.asList(2,4,5,8,1,3,8,9,10,78);
		Optional<Integer> op=numList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println("2nd highest number is "+op.get());
		//or 
		Optional<Integer> op2=numList.stream().distinct().sorted((a,b)->b-a).skip(1).findFirst();
		System.out.println("2nd highest number is "+op2.get());
		

	}

}
