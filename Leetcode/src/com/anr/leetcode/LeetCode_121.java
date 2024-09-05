package com.anr.leetcode;

public class LeetCode_121 {

	public static void main(String[] args) {

		int prices[] = { 7, 1, 5, 3, 6, 4 };
//		int prices[] = { 1,3};
		maxProfit(prices);

	}

	private static void maxProfit(int[] prices) {

		int index = 0;
		int profit = 0;
		int small = prices[index];
		int n = prices.length;// 6
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < small) {
				small = prices[i];
				index = i;
			}
		}
		for (int i = 1; i < prices.length-1; i++) { // 0 1 2 3 4 5
			int temp = prices[index + (i)] - small;
			//System.out.println("Temp " + temp);
			profit = Math.max(temp, profit);
//			System.out.println("Profit " + profit);
		}
		System.out.println(profit);
	}
}
