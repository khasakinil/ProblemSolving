package com.dsa.ps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestRepeatedSubsequence {

	/*
	 * Given a string, print the longest repeating subsequence such that the two
	 * subsequence don’t have same string character at same position, i.e., any i’th
	 * character in the two subsequences shouldn’t have the same index in the
	 * original string.
	 * 
	 * Input: str = "aabb" Output: "ab"
	 * 
	 * Input: str = "aab" Output: "a"
	 * 
	 */

	public static void main(String args[]) {
		String str = "AABEBCDD";

		String longestRepeatedSubsequence = longestRepeatedSubSeq(str);
		System.out.println("longestString : " + longestRepeatedSubsequence);

	}

	private static String longestRepeatedSubSeq(String str) {
		String longSubsequence = "";

		int maxLen = 0;
		Map<Character, Integer> charMap = new LinkedHashMap<>();

		for (int i = 0; i < str.length(); i++) {
			charMap.put(str.charAt(i), charMap.getOrDefault(str.charAt(i), 0) + 1);

			if (maxLen < charMap.get(str.charAt(i))) {
				maxLen = charMap.get(str.charAt(i));
			}
		}

		for (Map.Entry<Character, Integer> map : charMap.entrySet()) {
			if (map.getValue() == maxLen) {
				longSubsequence += map.getKey();
			}
		}

		return longSubsequence;
	}
}
