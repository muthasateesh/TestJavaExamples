package com.sample.test;

import java.util.Arrays;

public class AnagramChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="LISTEN";
		String str2="SILENT";
		boolean areAnagrams= areAnagrams(str1,str2);
		
		System.out.print("is anagram ? "+areAnagrams);

	}
	
	public static boolean areAnagrams(String str1,String str2) {
		
		char[] charArray1=str1.toCharArray();
		char[] charArray2=str2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		return Arrays.equals(charArray1, charArray2);
		
		
	}

}
