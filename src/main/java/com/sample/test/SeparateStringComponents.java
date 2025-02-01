package com.sample.test;

import java.util.List;
import java.util.stream.Collectors;

public class SeparateStringComponents {

	public static void main(String[] args) {
		String str = "Hello123, World!?-";
        separateComponents(str);
        separateComponentsUsingStreamAPI(str);
	}
	 public static void separateComponents(String str) {
	        StringBuilder words = new StringBuilder();
	        StringBuilder numbers = new StringBuilder();
	        StringBuilder specialChars = new StringBuilder();

	        for (char c : str.toCharArray()) {
	            if (Character.isLetter(c)) {
	                words.append(c);
	            } else if (Character.isDigit(c)) {
	                numbers.append(c);
	            } else {
	                specialChars.append(c);
	            }
	        }

	        System.out.println("Words: " + words.toString());
	        System.out.println("Numbers: " + numbers.toString());
	        System.out.println("Special Characters: " + specialChars.toString());
	 }
	 
	 public static void separateComponentsUsingStreamAPI(String str) {
		 
		List<Character> letters= str.chars().mapToObj(c->(char)c).filter(Character::isLetter).collect(Collectors.toList());
		List<Character> numbers= str.chars().mapToObj(c->(char)c).filter(Character::isDigit).collect(Collectors.toList());
		List<Character> SpecialCharacters= str.chars().mapToObj(c->(char)c).filter(c->!Character.isLetterOrDigit(c)).collect(Collectors.toList());
	 System.out.println("Letters : "+letters.stream().map(String::valueOf).collect(Collectors.joining()));
	 System.out.println("Numbers : "+numbers.stream().map(String::valueOf).collect(Collectors.joining()));
	 System.out.println("Special Characters : "+SpecialCharacters.stream().map(String::valueOf).collect(Collectors.joining()));
		
	 }	 
}
