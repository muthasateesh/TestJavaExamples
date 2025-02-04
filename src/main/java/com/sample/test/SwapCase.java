package com.sample.test;

public class SwapCase {

	public static void main(String[] args) {
		 String s = "sateeshKUMAR";
	        // ASCII code to swap the letters
	        System.out.print(swapCase(s));

	}
	public static String swapCase(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append((char) (c + 32));
            } else if (c >= 'a' && c <= 'z') {
                sb.append((char) (c - 32));
            }
        }
        return sb.toString();
    }

}
