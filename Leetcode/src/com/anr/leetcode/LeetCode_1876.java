package com.anr.leetcode;

import java.util.HashSet;

public class LeetCode_1876 {

	public static void main(String[] args) {
		String s = "aababcabc";
		countGoodSubstrings(s);
		System.out.println(countGoodSubstrings(s));
	}

//Time Complexity is O(n^3)
	public static int countGoodSubstrings(String s) {
		int output = 0;
		int n = s.length();
		int sw = 3;
		for (int i = 0; i < n - sw + 1; i++) {
			boolean temp = fun(s.substring(i, i + sw), sw);
			if (temp) {
				output++;
			}
		}
		return output;
	}

	public static boolean fun(String s, int sw) {
		HashSet<Character> hs = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			hs.add(ch);
		}
		if (hs.size() == 3)
			return true;
		else
			return false;
	}
}
