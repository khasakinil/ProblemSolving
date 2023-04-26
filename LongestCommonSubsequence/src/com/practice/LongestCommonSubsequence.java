package com.practice;

public class LongestCommonSubsequence {

	/*
	 * Given two strings, S1 and S2, the task is to find the length of the longest
	 * subsequence present in both of the strings.
	 * 
	 * Input: S1 = “AGGTAB”, S2 = “GXTXAYB” Output: 4 Explanation: The longest
	 * subsequence which is present in both strings is “GTAB”.
	 */

	public static void main(String args[]) {

		String str1 = "AGGTAB";
		String str2 = "GXTXAYB";
		int longestSubSequence = getLongestCommonSubsequence(str1, str2);
		System.out.println("longestSubSequence : " + longestSubSequence);
	}

	private static int getLongestCommonSubsequence(String str1, String str2) {
		int longestSubsequence1 = 0;
		int longestSubsequence2 = 0;
		int str2Counter = 0;
		for (int i = 0; i < str1.length(); i++) {
			for (int j = str2Counter; j < str2.length(); j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					longestSubsequence1++;
					str2Counter = j + 1;
					break;
				}
			}
		}

		str2Counter = 0;
		for (int i = 0; i < str2.length(); i++) {
			for (int j = str2Counter; j < str1.length(); j++) {
				if (str2.charAt(i) == str1.charAt(j)) {
					longestSubsequence2++;
					str2Counter = j + 1;
					break;
				}
			}
		}

		if (longestSubsequence1 > longestSubsequence2) {
			return longestSubsequence1;
		}

		return longestSubsequence2;
	}

}
