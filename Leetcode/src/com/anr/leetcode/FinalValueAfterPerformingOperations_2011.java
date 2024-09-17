package com.anr.leetcode;

public class FinalValueAfterPerformingOperations_2011 {

	public static void main(String[] args) {
		String[] operations = { "X++", "X++", "++X" };
		System.out.println(finalValue(operations));
	}

	private static int finalValue(String[] operations) {

		int ans = 0;
		for (int i = 0; i < operations.length ; i++) {
			String temp = operations[i];
			if ((temp.equals("++X") || (temp.equals("X++")))) {
				ans = ans + 1;
			} else {
				ans = ans - 1;
			}
		}
		return ans;
	}
}
