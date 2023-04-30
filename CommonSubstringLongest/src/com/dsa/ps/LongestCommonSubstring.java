package com.dsa.ps;

public class LongestCommonSubstring {

	/*
	 * Given two strings ‘X’ and ‘Y’, find the length of the longest common
	 * substring.
	 * 
	 * Input : X = “abcdxyz”, y = “xyzabcd” Output : 4 Explanation: The longest
	 * common substring is “abcd” and is of length 4.
	 */

	public static void main(String args[]) {
		String str1 = "abcdxyz";
		String str2 = "xyzabcd";

		String longestString = getLongestCommonSubstring(str1, str2);
		System.out.println("longestString : " + longestString);

	}

	private static String getLongestCommonSubstring(String str1, String str2) {
		int maxStrLen = 0;
		String longestStr = "";

		for (int i = 0; i < str1.length(); i++) {
			for (int j = i + 1; j < str1.length(); j++) {
				String tempStr = str1.substring(i, j);
				if (str2.contains(tempStr) && tempStr.length() > maxStrLen) {
					maxStrLen = tempStr.length();
					longestStr = tempStr;
				}
			}
		}
		return longestStr;
	}
}
