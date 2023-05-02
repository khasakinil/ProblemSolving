package com.dsa.ps;

public class LongestPalindromicSubsequence {

	/*
	 * Given two strings ‘X’ and ‘Y’, find the length of the longest common
	 * substring.
	 * 
	 * Input : X = “abcdxyz”, y = “xyzabcd” Output : 4 Explanation: The longest
	 * common substring is “abcd” and is of length 4.
	 */

	public static void main(String args[]) {
		String str = "geeksforgeeks";

		String longestString = getLongestPalindromicSubsequence(str);
		System.out.println("longestString : " + longestString);

	}

	private static String getLongestPalindromicSubsequence(String str) {
		String palindromeStr = "";

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				String tempStr = str.substring(i, j);
				if (palindromeStr.length() < tempStr.length() && isPalindrome(tempStr)) {
					palindromeStr = tempStr;
				}
			}
		}
		return palindromeStr;
	}

	private static boolean isPalindrome(String tempStr) {
		int i = 0;
		int j = tempStr.length() - 1;
		while (i < j) {
			if (tempStr.charAt(i) != tempStr.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
