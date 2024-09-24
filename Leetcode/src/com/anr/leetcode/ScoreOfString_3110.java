package com.anr.leetcode;

/*
You are given a String s. The score of the String is defined as the sum of the absolute difference between the ASCII values of adjacent characters
Return the score s.
 ex: input s = "hello" (|104 - 101| + || + || ... )
output = 13 
 */
public class ScoreOfString_3110 {

	public static void main(String[] args) {
		scoreOfString("hello");

	}
	
	public static int scoreOfString(String string) {

		int score = 0;

		for (int i = 0; i < string.length() - 1; i++) {
			int first = string.charAt(i);
			int second = string.charAt(i + 1);
			int ascii1 = first;
			int ascii2 = second;
			int temp = Math.abs(ascii1 - ascii2);
			score = score + temp;
		}
		return score;

	}
}
