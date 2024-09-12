package com.anr.leetcode;

import java.util.HashMap;

public class LeetCode_169 {

	public static void main(String[] args) {
		int nums[] = { 3, 2, 3, 5, 2, 2, 2, 8, 2 };
		majorityElement(nums);
	}

	private static void majorityElement(int[] nums) {
		int n = nums.length;
		int key;
		int ans = 0;
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < n; i++) {
			key = nums[i];
			if (hashMap.containsKey(key)) {
				int val = hashMap.get(key);
				hashMap.put(key, val + 1);
			} else {
				hashMap.put(key, 1);
			}
		}
		for (int k : hashMap.keySet()) {
			int a = hashMap.get(k);
			if (a > n / 2) {
				ans = k;
			}
		}
		System.out.println(ans);
	}
}
