package com.anr.leetcode;

public class DefangIPaddress_1108 {

	public static void main(String[] args) {
		defangIPaddress("123.21.14.123");
		System.out.println(defangIPaddress("123.21.14.123"));

	}

	private static String defangIPaddress(String address) {
		String ans = "";
		for (int i = 0; i < address.length(); i++) {
			char c = address.charAt(i);
			if (c == '.') {
				ans = ans + "[.]";
			} else {
				ans += c;
			}
		}
		return ans;

	}

}
