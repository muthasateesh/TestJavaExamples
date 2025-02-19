package com.sample.test;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class VowelsCountFromString {

	public static void main(String[] args) {
		String str = "hello how are you";
		System.out.println(" Number of Vowels in given String are " + fetchVowelsCount(str));
		String input = "This is interview for java engineer to Software Solutions";
		fetchHigestRepeatedVowelFromString(input);
		fetchHighestRepeatedVowelsCountFromString(input);
	}

	// Fetch count of Vowels from given string
	private static long fetchVowelsCount(String str) {
		return str.chars().filter(x -> {
			return (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I'
					|| x == 'O' || x == 'U');
		}).count();

	}

	// Fetch highest repeated vowel from given String
	private static void fetchHigestRepeatedVowelFromString(String input) {

		Map<Character, Long> map = input.chars().filter(c -> {
			return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I'
					|| c == 'O' || c == 'U');

		}).mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Entry<Character, Long> ch = map.entrySet().stream().max(Map.Entry.comparingByValue()).get();

		System.out.println(ch);

	}

	// 2nd way
	private static void fetchHighestRepeatedVowelsCountFromString(String input) {

		Predicate<Character> isVowel = c -> "aeiouAEIOU".indexOf(c) != -1;

		Optional<Map.Entry<Character, Long>> ch = input.chars().mapToObj(c -> (char) c).filter(isVowel::test)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue());

		ch.ifPresent(System.out::println);
	}

}
