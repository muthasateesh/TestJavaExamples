package com.sample.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWith {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(21,22,27,30,13);
		l.stream().filter(i->String.valueOf(i).startsWith("2")).collect(Collectors.toList()).forEach(System.out::println);;

	}

}
