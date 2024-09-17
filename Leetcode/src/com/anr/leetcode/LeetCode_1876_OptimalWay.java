package com.anr.leetcode;

import java.util.HashMap;

public class LeetCode_1876_OptimalWay {

	public static void main(String[] args) {
		String s = "aababcabc";
		System.out.println(countGoodSubstrings(s));
	}

	//Time Complexity--->O(n)
	private static int countGoodSubstrings(String s) {
		int l = 0, ans = 0, k = 3;
		HashMap<Character, Integer> hm = new HashMap<>();

		for (int r = 0; r < s.length(); r++) {
			char ch = s.charAt(r);
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
			if (r - l == k) {
				char tempCh = s.charAt(l);
				hm.put(tempCh, hm.get(tempCh) - 1);
				if (hm.get(tempCh) == 0) {
					hm.remove(tempCh);
				}
				l++;
			}
			if (hm.size() == 3) {
				ans += 1;
			}
		}
		return ans;
	}

}
