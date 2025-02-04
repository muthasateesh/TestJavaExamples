package com.sample.test;

import java.util.HashMap;
import java.util.Map;

public class FindTwoSumIndexies {

	public static void main(String[] args) {
		 int[] nums = {2, 7, 11, 15};
	        int target = 18;
	        int[] result = findTwoSum(nums, target);
	        System.out.println("Indices: " + result[0] + ", " + result[1]);

	}
	public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
