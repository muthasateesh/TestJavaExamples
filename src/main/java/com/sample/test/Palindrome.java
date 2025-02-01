package com.sample.test;

public class Palindrome {

	public static void main(String[] args) {
		// For number
		 int number = 1221;
	        if (isPalindrome(number)) {
	            System.out.println(number + " is a palindrome.");
	        } else {
	            System.out.println(number + " is not a palindrome.");
	        }
	     // for String
	        String str = "madam";
	        if (isPalindrome(str)) {
	            System.out.println("\"" + str + "\" is a palindrome.");
	        } else {
	            System.out.println("\"" + str + "\" is not a palindrome.");
	        }   

	}


public static boolean isPalindrome(int number) {
    int originalNumber = number;
    int reversedNumber = 0;

    while (number != 0) {
        int digit = number % 10;
        reversedNumber = reversedNumber * 10 + digit;
        number /= 10;
    }

    return originalNumber == reversedNumber;
}

public static boolean isPalindrome(String str) {
    int left = 0;
    int right = str.length() - 1;

    while (left < right) {
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }

    return true;
}

}
