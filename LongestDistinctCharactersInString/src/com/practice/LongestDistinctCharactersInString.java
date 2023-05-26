package com.practice;

import java.util.HashMap;
import java.util.Map;

public class LongestDistinctCharactersInString {

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		String output = getLongestDistinctCharactersInString(str);
		System.out.println("LongestDistinctCharactersInString: " + output);
	}

	private static String getLongestDistinctCharactersInString(String str) {
		String longestString = "";

		for (int i = 0; i <= str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String temp = str.substring(i, j);
				if (longestString.length() < temp.length() && !isContainDuplicate(temp)) {
					longestString = temp;
				}
			}
		}
		return longestString;
	}

	private static boolean isContainDuplicate(String temp) {
		boolean containDuplicate = false;

		Map<Character, Integer> charCount = new HashMap<>();

		for (int i = 0; i < temp.length(); i++) {
			charCount.put(temp.charAt(i), charCount.getOrDefault(temp.charAt(i), 0) + 1);
			if (charCount.get(temp.charAt(i)) > 1) {
				containDuplicate = true;
				break;
			}
		}
		return containDuplicate;
	}
}
