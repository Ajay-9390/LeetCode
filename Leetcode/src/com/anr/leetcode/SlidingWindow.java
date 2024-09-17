package com.anr.leetcode;

//Find the highest sum of the sub array of length 3
public class SlidingWindow {

	public static void main(String[] args) {
		int[] arr = { 5, 9, 1, 8, 7 };
		bruteForceMethod(arr);
		optimalMethod(arr);
	}

	// Time_Complexity=O(n^3)
	private static void bruteForceMethod(int arr[]) {

		int sl = 3;
		int ans = 0;
		for (int i = 0; i <= arr.length - sl; i++) {
			int j = i + sl - 1;
			int temp = 0;
			for (int k = i; k <= j; k++) {
				temp += arr[k];
			}
			ans = Math.max(temp, ans);
		}
		System.out.println(ans);
	}

	// Time_Complexity=O(n)
	private static void optimalMethod(int arr[]) {
		int left = 0;
		int temp = 0;
		int ans = 0;
		int slidingWindow = 3;
		for (int right = 0; right < arr.length; right++) {
			temp += arr[right];
			if (right - left == slidingWindow) {
				temp -= arr[left];
				left++;
			}
			if (right - left + 1 == slidingWindow) {
				ans = Math.max(temp, ans);
			}
		}
		System.out.println(ans);
	}

}
