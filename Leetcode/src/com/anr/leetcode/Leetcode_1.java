package com.anr.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Leetcode_1 {
	public static void main(String[] args) {
		
//	int[] nums = { 2, 7, 11, 14 };
//	int target = 9;
	int[] nums = { 3, 2, 4 };
	int target = 6;
//	System.out.println(twoSum(nums, target));	
//	twoSum(nums, target);
	int arr[] = method2(nums, target);
	// System.out.println(method2(nums, target));
	System.out.println(Arrays.toString(arr));
}

// Bruteforce method - Time Complexity -> O(n^2)
	private static void twoSum(int[] nums, int target) {
		int ans[] = new int[2];
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					ans[0] = i;
					ans[1] = j;
				}
				System.out.println(i + " " + j);

			}
		}
		System.out.println(Arrays.toString(ans));
		// return Arrays.toString(ans);
	}

// Time Complexity -> O(n)
	private static int[] method2(int[] nums, int target) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		int[] ans = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if (hashMap.containsKey(target - nums[i])) {
				ans[1] = i;
				ans[0] = hashMap.get(target - nums[i]);
				return ans;
			}
			hashMap.put(nums[i], i);
		}
		System.out.println(Arrays.toString(ans));// To see ans
		return ans;// if we try to print this, it gives hashcode of the array
	}

}
