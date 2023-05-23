package com.ps;

public class LongestCommonSubString {

	public static void main(String[] args) {
		String str1 = "ABCDGH";
		String str2 = "ACDGHR";

		String longestCommonsSubstr = getLongestCommonSubString(str1, str2);

		System.out.println(
				"LongestCommonSubString : " + longestCommonsSubstr + ", Length : " + longestCommonsSubstr.length());

	}

	private static String getLongestCommonSubString(String str1, String str2) {

		String longestSubstr = "";
		for (int i = 0; i <= str1.length(); i++) {
			for (int j = i + 1; j <= str1.length(); j++) {
				String subStr = str1.substring(i, j);
				if (longestSubstr.length() < subStr.length() && str2.contains(subStr)) {
					longestSubstr = subStr;
				}
			}
		}

		return longestSubstr;
	}

}
