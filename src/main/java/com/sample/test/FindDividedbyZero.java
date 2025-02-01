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
		System.out.println(2.0/0);// Infinity
		System.out.println(2/0); //Exception java.lang.ArithmeticException: / by zero
	}

}
