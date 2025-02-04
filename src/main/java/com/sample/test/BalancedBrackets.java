package com.sample.test;

import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
	    System.out.println(isBalanced("{([])}"));  // Output: true
        System.out.println(isBalanced("{}()[]"));  // Output: true
        System.out.println(isBalanced("{([)]}"));  // Output: false
        
        System.out.println(isBalanced2ndWay("{([])}"));  // Output: true
        System.out.println(isBalanced2ndWay("{}()[]"));  // Output: true
        System.out.println(isBalanced2ndWay("{([)]}"));  // Output: false

	}
	
	  public static boolean isBalanced(String s) {
	        Stack<Character> stack = new Stack<>();
	        for (char c : s.toCharArray()) {
	            if (c == '(' || c == '{' || c == '[') {
	                stack.push(c);
	            } else if (c == ')' || c == '}' || c == ']') {
	                if (stack.isEmpty()) {
	                    return false;
	                }
	                char top = stack.pop();
	                if ((c == ')' && top != '(') ||
	                    (c == '}' && top != '{') ||
	                    (c == ']' && top != '[')) {
	                    return false;
	                }
	            }
	        }
	        return stack.isEmpty();
	    }
	  
	  public static boolean isBalanced2ndWay(String s) {
	        int round = 0, curly = 0, square = 0;

	        for (char c : s.toCharArray()) {
	            if (c == '(') round++;
	            else if (c == ')') round--;
	            else if (c == '{') curly++;
	            else if (c == '}') curly--;
	            else if (c == '[') square++;
	            else if (c == ']') square--;

	            if (round < 0 || curly < 0 || square < 0) {
	                return false;
	            }
	        }
	        
	        return round == 0 && curly == 0 && square == 0;
	    }

}
