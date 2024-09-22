package com.anr.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode_1796 {
	public static void main(String[] args) {
		String s = "ajay12321nayak";
		System.out.println(secondHighest(s));
	}

	public static int secondHighest(String s) {
		Set<Integer> hs = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				hs.add(Character.getNumericValue(ch));
			}
		}
		List<Integer> al = new ArrayList<>(hs);
		Collections.sort(al);
		if (al.size() < 2)
			return -1;
		else {
			int result = al.get(al.size() - 2);
			return result;
		}

	}
}
