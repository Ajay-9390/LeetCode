package com.anr.leetcode;

import java.util.ArrayList;
import java.util.List;


public class LeetCode_1431 {

	public static void main(String[] args) {
//		int[] candies = { 2, 3, 5, 1, 3 };
		int[] candies = { 1, 3, 9 };
		int extraCandies = 4;
		System.out.println(kidsWithCandies(candies, extraCandies));
	}

	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int max = -1;
		for (int i = 0; i < candies.length; i++) {
			if (candies[i] > max) {
				max = candies[i];
			}
		}

		List<Boolean> li = new ArrayList<Boolean>();
		for (int i = 0; i < candies.length; i++) {
			if (candies[i] + extraCandies >= max) {
				li.add(true);
			} else {
				li.add(false);
			}
		}
		return li;
	}
}
