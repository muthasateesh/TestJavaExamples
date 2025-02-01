package com.sample.test;

public class MaxProfitConsecutiveYears {

	public static void main(String[] args) {
	        int[] profits = {110000, 120000, 90000, 150000, 130000, 140000, 70000, 160000, 180000};
	        int startYear = 2000;
	        System.out.println("Maximum profit from 3 consecutive years: " + findMaxProfit(profits, startYear));

	}

public static String findMaxProfit(int[] profits, int startYear) {
    if (profits.length < 3) {
        throw new IllegalArgumentException("Array must have at least 3 years of profits.");
    }

    int maxProfit = 0;
    int maxProfitStartYear = startYear;

    // Calculate the sum of the first 3 years
    for (int i = 0; i < 3; i++) {
        maxProfit += profits[i];
    }

    int currentSum = maxProfit;

    // Iterate through the array to find the maximum sum of 3 consecutive years
    for (int i = 3; i < profits.length; i++) {
        currentSum = currentSum - profits[i - 3] + profits[i];
        if (currentSum > maxProfit) {
            maxProfit = currentSum;
            maxProfitStartYear = startYear + (i - 2); // Update the start year for max profit period
        }
    }

    return "Years: " + maxProfitStartYear + ", " + (maxProfitStartYear + 1) + ", " + (maxProfitStartYear + 2) + " with profit: " + maxProfit;
}
}
