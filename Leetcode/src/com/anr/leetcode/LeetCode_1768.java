package com.anr.leetcode;

public class LeetCode_1768 {

	public static void main(String[] args) {
		String word1 = "abc";
		String word2 = "pq";
		// mergeAlternately(word1, word2);
		System.out.println(mergeAlternately(word1, word2));
		System.out.println(mergeAlternately2(word1, word2));
	}

	public static String mergeAlternately(String word1, String word2) {
		String output = "";
		int i = 0;
		while (i < word1.length() || i < word2.length()) {
			if (i < word1.length()) {
				output += word1.charAt(i);
			}
			if (i < word2.length()) {
				output += word2.charAt(i);
			}
			i++;
		}
		return output;
	}

	public static String mergeAlternately2(String word1, String word2) {
		StringBuilder output = new StringBuilder();
		int i = 0;
		while (i < word1.length() || i < word2.length()) {
			if (i < word1.length()) {
				output.append(word1.charAt(i));
			}
			if (i < word2.length()) {
				output.append(word2.charAt(i));
			}
			i++;
		}
		return output.toString();
	}
}
