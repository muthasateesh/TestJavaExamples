package com.sample.test;

import java.util.Arrays;
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
		List<String> wordList=Arrays.asList("Amanda","Rob","Sunny","Amanda","Rob");
		Map<String,Long> wordMap=wordList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(wordMap);
		
		// Repeated and Non Repeated i.e Duplicate and Non Duplicate Characters
		
		Map<Character,Long> charCountMap=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		Optional<Character>findFirstRepeatedChar =charCountMap.entrySet().stream().filter(k->k.getValue()>1).map(k->k.getKey()).findFirst();
		System.out.println("findFirstRepeatedChar : "+findFirstRepeatedChar.get());
		Optional<Character> findFirstNonRepeatedChar =charCountMap.entrySet().stream().filter(k->k.getValue()==1).map(k->k.getKey()).findFirst();
		System.out.println("findFirstNonRepeatedChar : "+findFirstNonRepeatedChar.get());
		
		
		
	}

}
