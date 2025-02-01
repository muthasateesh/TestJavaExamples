package com.sample.test;

public class SeparateStringComponents {

	public static void main(String[] args) {
		String str = "Hello123, World!?-";
        separateComponents(str);
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
}
