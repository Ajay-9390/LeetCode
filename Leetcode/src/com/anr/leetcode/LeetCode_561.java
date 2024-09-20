package com.anr.leetcode;

import java.util.Arrays;

public class LeetCode_561 {

	public static void main(String[] args) {
		int[] nums = {1,4,3,2};
		System.out.println(arrayPairSum(nums));

	}

	public static int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int ans = 0;
		for (int i = 0; i < nums.length; i = i + 2) {
			ans += nums[i];
		}
		return ans;
	}
}
