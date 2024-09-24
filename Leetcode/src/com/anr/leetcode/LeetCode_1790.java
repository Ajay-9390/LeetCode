package com.anr.leetcode;

import java.util.HashMap;

public class LeetCode_1790 {

	public static void main(String[] args) {
		String s1 = "kanb";
		String s2 = "ban";
		System.out.println(areAlmostEqual(s1, s2));
		String[] ch = {"a","a"};
		int length = ch.length;
		System.out.println(length);
	}

	public static boolean areAlmostEqual(String s1, String s2) {
		HashMap<Character, Integer> hm1 = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			char key = s1.charAt(i);
			hm1.put(key, hm1.getOrDefault(key, 0) + 1);
		}
		HashMap<Character, Integer> hm2 = new HashMap<>();
		for (int i = 0; i < s2.length(); i++) {
			char key = s2.charAt(i);
			hm2.put(key, hm2.getOrDefault(key, 0) + 1);
		}
		if (hm1.equals(hm2)) {
			return true;
		} else 
			return false;
		
	}

}
