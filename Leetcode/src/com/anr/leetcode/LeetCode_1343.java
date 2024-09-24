package com.anr.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode_1343 {

	public static void main(String[] args) {
		int[] nums = { 2, 2, 2, 2, 5, 5, 5, 8 };
		int k = 3;
		int threshold = 4;
//		System.out.println(getSneakyNumbers(nums));
		System.out.println(getSneakyNumbers(nums, k, threshold));
	}

	public static int getSneakyNumbers(int[] arr, int k, int threshold) {
		int ans = 0, temp = 0, l = 0, average = 0;
		for (int r = 0; r < arr.length; r++) {
			temp += arr[r];
			if (r - l == k) {
				temp -= arr[l];
				l++;
			}
			if (r - l + 1 == k) {
				if (temp / k >= threshold) {
					ans++;
				}
			}
		}
		return ans;
	}
}
