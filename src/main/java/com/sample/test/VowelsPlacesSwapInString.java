package com.sample.test;

public class VowelsPlacesSwapInString {

	public static void main(String[] args) {
		String str="i am a java developer";
		 System.out.println("Original string: " + str);
	     System.out.println("Vowel swapped string: " + swapVowels(str));

	}
	 public static String swapVowels(String str) {
	        char[] chars = str.toCharArray();
	        int[] vowelPositions = new int[chars.length];
	        char[] vowels = new char[chars.length];
	        int vowelCount = 0;

	        // Collect all vowels and their positions
	        for (int i = 0; i < chars.length; i++) {
	            if (isVowel(chars[i])) {
	                vowels[vowelCount] = chars[i];
	                vowelPositions[vowelCount] = i;
	                vowelCount++;
	            }
	        }

	        // Swap vowels in the original string in reverse order
	        for (int i = 0; i < vowelCount; i++) {
	            chars[vowelPositions[i]] = vowels[vowelCount - 1 - i];
	        }

	        return new String(chars);
	    }

public static boolean isVowel(char c) {
    return "aeiouAEIOU".indexOf(c) != -1;
}


}
