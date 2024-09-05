package com.anr.leetcode;

/*
 * Return the maximum difference. If no such i and j exists, return -1.
Example 1:
Input: nums = [7,1,5,4]
Output: 4
Explanation:
The maximum difference occurs with i = 1 and j = 2, nums[j] - nums[i] = 5 - 1 = 4.
Note that with i = 1 and j = 0, the difference nums[j] - nums[i] = 7 - 1 = 6, but i > j, so it is not valid.
 */
public class LeetCode_2016 {

	public static void main(String[] args) {
		//int nums[] = { 7, 1, 5, 4 };
		// int nums[] = { 9, 4, 3, 2 };
		 int nums[] = { 1, 5, 2, 10 };
		maximumDifference(nums);
	}

	// Here TIme complexity is O(n)
	private static void maximumDifference(int[] nums) {
		int maxdiff = -1;
		int small = nums[nums.length - 1];
		// System.err.println(small);

		for (int i = nums.length - 2; i >= 0; i--) {
			//System.out.println(nums[i]);
			if (small > nums[i]) {
				int temp = small - nums[i];
				System.out.println(temp);
				maxdiff = Math.max(maxdiff, temp);
				System.err.println(maxdiff);
			} else {
				small = nums[i];
			}
			//System.err.println(small);
		}
		// System.out.println(small);
		 System.out.println(maxdiff);
	}
}
