package com.sample.test;

import java.util.*;

public class AnagramGrouping {
    public static void main(String[] args) {
        String[] inputArray = { "abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm" };
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String s : inputArray) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if (!anagramGroups.containsKey(sorted)) {
                anagramGroups.put(sorted, new ArrayList<>());
            }
            anagramGroups.get(sorted).add(s);
        }

        for (List<String> group : anagramGroups.values()) {
            System.out.println(group);
        }
    }
}
