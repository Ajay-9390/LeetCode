package com.anr.leetcode;

import java.util.HashMap;

public class JawalsAndStones_771 {

	public static void main(String[] args) {
		numJewelsInStones("aA", "aAAbbbb");
		System.out.println(numJewelsInStones("aA", "aAAbbbb"));
		System.out.println(method2("aA", "aAAbbbb"));

	}

	private static int numJewelsInStones(String jewels, String stones) {
		int output = 0;
		for (int i = 0; i < stones.length(); i++) {
			char stone = stones.charAt(i);
			for (int j = 0; j < jewels.length(); j++) {
				char jewel = jewels.charAt(j);
				if (stone == jewel) {
					output++;
				}
			}
		}
		return output;
	}

	// Using HashMAp
	private static int method2(String jewels, String stones) {
		int ans = 0;
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < stones.length(); i++) {
			char stone = stones.charAt(i);
			if (hm.containsKey(stone)) {
				int val = hm.get(stone);
				hm.put(stone, val + 1);
			} else {
				hm.put(stone, 1);
			}
		}
		for (int j = 0; j < jewels.length(); j++) {
			char jewel = jewels.charAt(j);
			if (hm.containsKey(jewel)) {
				ans += hm.get(jewel);
			}
		}
		return ans;
	}
}
