package com.sample.test;

public class PrimeNumber {

	public static void main(String[] args) {
		// PrimeNumberChecker 
		 int number = 29;
	        if (isPrime(number)) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
// All Prime Numbers
	        int n = 100; // Change this value to print prime numbers up to the desired limit
	        printAllPrimes(n);    
	        
	}
	public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
	
	 public static void printAllPrimes(int n) {
	        boolean[] isPrime = new boolean[n + 1];

	        // Manually initialize the array to true
	        for (int i = 2; i <= n; i++) {
	            isPrime[i] = true;
	        }

	        for (int i = 2; i * i <= n; i++) {
	            if (isPrime[i]) {
	                for (int j = i * i; j <= n; j += i) {
	                    isPrime[j] = false;
	                }
	            }
	        }

	        System.out.println("Prime numbers up to " + n + ":");
	        for (int i = 2; i <= n; i++) {
	            if (isPrime[i]) {
	                System.out.print(i + " ");
	            }
	        }
    }

}
