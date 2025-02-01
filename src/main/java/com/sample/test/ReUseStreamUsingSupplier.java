package com.sample.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReUseStreamUsingSupplier {

	public static void main(String[] args) {
		List<String> items = Arrays.asList("apple", "banana", "orange", "grape");

        Supplier<Stream<String>> streamSupplier = () -> items.stream();

        // First usage of the stream
        long count = streamSupplier.get().count();
        System.out.println("Count: " + count);

        // Second usage of the stream
        long wordsWithA = streamSupplier.get().filter(s -> s.contains("a")).count();
        System.out.println("Words with 'a': " + wordsWithA);
        
        // 2nd way
        String [] inputArray= {"apple", "banana", "orange", "grape"};
        Supplier<Stream<String>> inputStreamSupplier = () -> Stream.of(inputArray);
        inputStreamSupplier.get().forEach(e->System.out.println(e));
        
        long count2 = inputStreamSupplier.get().count();
        System.out.println("Count: " + count2);
        
        
        
       
        

	}

}
