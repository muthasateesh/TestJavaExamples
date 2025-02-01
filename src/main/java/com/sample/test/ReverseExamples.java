package com.sample.test;

public class ReverseExamples {

	public static void main(String[] args) {
		String str = "Hi Hello How are You";
		 int number = 12345;
		 // Reverse the number
        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed number: " + reversedNumber);
        
        // Reverse the entire string
        String reversedString = reverseString(str);
        System.out.println("Reversed string: " + reversedString);

        // Reverse each word in the string
        String reversedWords = reverseEachWord(str);
        System.out.println("Reversed each word: " + reversedWords);

	}
	//	 Reverse the entire string
	public static String reverseString(String str) {
	    char[] chars = str.toCharArray();
	    String reversed = "";

	    for (int i = chars.length - 1; i >= 0; i--) {
	        reversed += chars[i];
	    }

	    return reversed;
	}
	  // Reverse each word in the string	
	public static String reverseEachWord(String str) {
	    String[] words = str.split(" ");
	    String reversedString = "";

	    for (String word : words) {
	        char[] chars = word.toCharArray();
	        String reversedWord = "";

	        for (int i = chars.length - 1; i >= 0; i--) {
	            reversedWord += chars[i];
	        }

	        reversedString += reversedWord + " ";
	    }

	    return reversedString.trim();
	}
	
	// Method to reverse a number
    public static int reverseNumber(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return reversed;
    }

}
