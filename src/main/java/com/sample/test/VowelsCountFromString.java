package com.sample.test;

public class VowelsCountFromString {

	public static void main(String[] args) {
		String str="hello how are you";
		long count=str.chars().filter(x-> {
			return (x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U');
		}).count();
		System.out.println(" Number of Vowels in given String are "+count);
	}

}
