package com.sample.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicatesAndNonDuplicates {

	public static void main(String[] args) {
		//Duplicate Characters from given String
		String str="Hello How are you";
		Map<String,Long> strMap=str.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Object::toString,Collectors.counting()));
		System.out.println(strMap);
		// or
		Map<Character,Long> charMap2=str.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		System.out.println(charMap2);
		
		//Duplicate Numbers from given List
		List<Integer> numList=Arrays.asList(5,6,7,3,4,5,6,8,2,3,1,2,4,9,8);
		Map<Integer,Long> numMap=numList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(numMap);
		
		////Duplicate Words from given List
		List<String> wordList=Arrays.asList("Amanda","Rob","Sunny","Amanda","Rob","Amanda");
		Map<String,Long> wordMap=wordList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(wordMap);
		
		// Repeated and Non Repeated i.e Duplicate and Non Duplicate Characters
		
		Map<Character,Long> charCountMap=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		Optional<Character>findFirstRepeatedChar =charCountMap.entrySet().stream().filter(k->k.getValue()>1).map(k->k.getKey()).findFirst();
		System.out.println("findFirstRepeatedChar : "+findFirstRepeatedChar.get());
		Optional<Character> findFirstNonRepeatedChar =charCountMap.entrySet().stream().filter(k->k.getValue()==1).map(k->k.getKey()).findFirst();
		System.out.println("findFirstNonRepeatedChar : "+findFirstNonRepeatedChar.get());
		
		// 2nd most repeated Character
		Optional<Character>findSecoundRepeatedChar =charCountMap.entrySet().stream().filter(k->k.getValue()>1).map(k->k.getKey()).skip(1).findFirst();
		System.out.println("findSecoundRepeatedChar : "+findSecoundRepeatedChar.get());
		
		// 2nd most repeated String
	       System.out.println("The second most repeated string is: " + findSecondMostRepeated(wordList));
		
	}
	
	public static String findSecondMostRepeated(List<String> wordList) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each word
        for (String word : wordList) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        // Create a list of entries sorted by their frequency in descending order
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(frequencyMap.entrySet());
        sortedEntries.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        // Check if there are at least two distinct entries
        if (sortedEntries.size() < 2) {
            return "No second most repeated string";
        }

        // Return the second most repeated string
        return sortedEntries.get(1).getKey();
	}

}
