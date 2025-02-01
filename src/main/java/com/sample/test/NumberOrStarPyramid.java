package com.sample.test;

public class NumberOrStarPyramid {

	public static void main(String[] args) {
		int n = 5; // Number of levels
        printNumberPyramid(n);
        printStarsPyramid(n);
	}
	 public static void printNumberPyramid(int n) {
	        for (int i = 1; i <= n; i++) {
	            // Print leading spaces
	            for (int j = i; j < n; j++) {
	                System.out.print("  ");
	            }
	            // Print ascending numbers
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            // Print descending numbers
	            for (int j = i - 1; j >= 1; j--) {
	                System.out.print(j + " ");
	            }
	            // Move to the next line
	            System.out.println();
	        }
	    }
	 
	 public static void printStarsPyramid(int n) {
	        for (int i = 1; i <= n; i++) {
	            // Print leading spaces
	            for (int j = i; j < n; j++) {
	                System.out.print(" ");
	            }
	            // Print stars
	            for (int j = 1; j <= (2 * i - 1); j++) {
	                System.out.print("*");
	            }
	            // Move to the next line
	            System.out.println();
	        }
	    }

}
