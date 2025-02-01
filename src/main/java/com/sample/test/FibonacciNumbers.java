package com.sample.test;

public class FibonacciNumbers {

	public static void main(String[] args) {
		printFibanociiNumbers();
		System.out.println("Fibonacci Numbers In Triangle ");
		printFibanociiNumbersInTriangleFormat(4);
		System.out.println("Fibonacci Numbers In Pyramid ");
		printFibanociiNumbersInPyramidFormat(4);
	}
	// find first 10 Fibonacci numbers
	public static void printFibanociiNumbers() {
		int n=10,a=0,b=1;
		System.out.println("First "+n+" Fibonacci Numbers are below : ");
		for(int i=1;i<=n;i++) {
			System.out.print(a +" + ");
			int sum=a+b;
			a=b;
			b=sum;
		}
		System.out.println();
	}
	// Print Fibonacci  Numbers In a Triangle Format
	public static void printFibanociiNumbersInTriangleFormat(int n) {
		 int[] fib = new int[n * (n + 1) / 2];
	        fib[0] = 0;
	        fib[1] = 1;

	        // Generate Fibonacci numbers
	        for (int i = 2; i < fib.length; i++) {
	            fib[i] = fib[i - 1] + fib[i - 2];
	        }

	        int index = 0;

	        // Print Fibonacci numbers in a triangular format
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(fib[index++] + " ");
	            }
	            System.out.println();
	        }
	}
	
	// Print Fibonacci  Numbers In a Pyramid Format
	public static void printFibanociiNumbersInPyramidFormat(int n) {
		int[] fib = new int[n * n];
        fib[0] = 0;
        fib[1] = 1;

        // Generate Fibonacci numbers
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        int index = 0;

        // Print Fibonacci numbers in a pyramid format
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print Fibonacci numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(fib[index++] + " ");
            }
            System.out.println();
        }
    }
}
