package com.sample.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStrings {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("dog", "cat", "rabbit", "zebra", "fox");
		
		Map<Integer, List<String>> groupedStrings =	list.stream().map(s->s).collect(Collectors.groupingBy(s->s.length()));
		System.out.println(groupedStrings);
		// Print the groups
        groupedStrings.forEach((length, strings) -> {
            System.out.print(length + ": " + strings);
            System.out.println();
        });
	}

}
