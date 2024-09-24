package com.anr.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
 * Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
Example 1:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
 */

public class LeetCode_118 {

	public static void main(String[] args) {

		int numRows = 6;
		System.out.println(generate(numRows));

	}

	private static List<List<Integer>> generate(int numRows) {

		List<List<Integer>> ans = new ArrayList<>();

		List<Integer> firstRow = new ArrayList<>();
		firstRow.add(1);
		ans.add(firstRow);

		for (int i = 1; i < numRows; i++) {
			List<Integer> tempRow = new ArrayList<>();
			tempRow.add(1);

			for (int j = 1; j < i; j++) {
				int sum = ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1);
				tempRow.add(sum);
			}
			tempRow.add(1);
			ans.add(tempRow);
		}
		return ans;

	}
}
