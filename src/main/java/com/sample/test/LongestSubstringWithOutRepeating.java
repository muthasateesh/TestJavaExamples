package com.sample.test;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithOutRepeating {

	public static void main(String[] args) {
	        String input = "pwwkew";
	        String longestSubstring = longestSubstringWithoutRepeatingChars(input);
	        System.out.println("The longest substring without repeating characters is: " + longestSubstring);
	}
	
    public static String longestSubstringWithoutRepeatingChars(String s) {
        int n = s.length(); 
        Set<Character> set = new HashSet<>();
        int maxLength = 0, i = 0, j = 0;
        int start = 0; // To keep track of the start index of the longest substring

        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++)); //
                if (j - i > maxLength) {
                    maxLength = j - i; // 
                    start = i; // Update start index of the longest substring
                }
            } else {
                set.remove(s.charAt(i++));
            }
        }

        return s.substring(start, start + maxLength); // Extract the longest substring
    }

}
