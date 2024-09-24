package com.anr.leetcode;
//maximum number of people bus can afford when their sum should be less than 10
public class VariableSizeSlidingWindow {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1, 1, 1, 9 };
		int k = 3;
//		System.out.println(getSneakyNumbers(nums));
		System.out.println(getSneakyNumbers(nums, k));
	}

	public static int getSneakyNumbers(int[] nums, int k) {
		int ans = 0, temp = 0, l = 0;
		for (int r = 0; r < nums.length; r++) {
			temp += nums[r];
			while (temp > 10) {
				temp -= nums[l];
				l++;
			}
			ans = Math.max(ans, r-l+1);
		}
		return ans;
	}
}
