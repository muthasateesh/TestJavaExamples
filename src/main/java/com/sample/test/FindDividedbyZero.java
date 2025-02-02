package com.sample.test;

public class FindDividedbyZero {

	public static void main(String[] args) {
		String a="10";
		String b="20";
		String c="2.5";
		System.out.println(a+b);//1020
		System.out.println(a+c);//102.5
		System.out.println(Integer.parseInt(a)+Integer.parseInt(b));//30
		System.out.println(Integer.parseInt(a)+Double.parseDouble(c)); //12.5
		System.out.println(0.2 == 0.1*2);// true  
		System.out.println(0.3 == 0.1*3);// false because 0.1 times 3 does not exactly equal 0.3 due to how floating-point numbers are represented in binary, leading to a slight precision error.
		System.out.println(2.0/0);// Infinity
		System.out.println(2/0); //Exception java.lang.ArithmeticException: / by zero
	}

}
