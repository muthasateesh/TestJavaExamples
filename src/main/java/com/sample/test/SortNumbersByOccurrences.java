package com.sample.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortNumbersByOccurrences {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 3, 1, 2, 5, 3, 5, 2, 4, 1, 3, 2, 2, 1);
		List<Integer> sortedByOccurrences = sortNumbersByOccurrences(numbers);
		System.out.println("Numbers sorted by occurrences: " + sortedByOccurrences);
		List<Integer> sortedByOccurrences2ndWay = sortNumbersByOccurrences2ndWay(numbers);
		System.out.println("Numbers sorted by occurrences: " + sortedByOccurrences2ndWay);
	}

	public static List<Integer> sortNumbersByOccurrences(List<Integer> numbers) {
		// Count the occurrences of each number
		Map<Integer, Long> occurrenceMap = numbers.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// Sort the numbers based on their occurrences and then by natural order
		return numbers.stream()
				.sorted(Comparator.comparingLong((Integer n) -> occurrenceMap.get(n)).thenComparing(n -> n).reversed())
				.collect(Collectors.toList());

	}
	// or 2nd way
	public static List<Integer> sortNumbersByOccurrences2ndWay(List<Integer> numbers) {
		// Count the occurrences of each number
		Map<Integer, Long> occurrenceMap = numbers.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// Sort the numbers based on their occurrences and then by natural order
		return numbers.stream()
				.sorted((e1,e2)->{
					int compare =occurrenceMap.get(e2).compareTo(occurrenceMap.get(e1));
					return compare !=0 ? compare:e1.compareTo(e2);
				})
//				.distinct() // if we want only unique values
				.collect(Collectors.toList());

	}

}
