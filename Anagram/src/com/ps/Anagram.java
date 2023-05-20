package com.ps;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "abcdef";
		String str2 = "cdefa";

		String isAnagram = checkIsAnagram(str1, str2);
		System.out.println("isAnagram : " + isAnagram);
	}

	private static String checkIsAnagram(String str1, String str2) {
		Map<Character, Integer> str1CharCount = new HashMap<>();
		Map<Character, Integer> str2CharCount = new HashMap<>();

		String isAnagram = "YES";

		for (int i = 0; i < str1.length(); i++) {
			str1CharCount.put(str1.charAt(i), str1CharCount.getOrDefault(str1.charAt(i), 0) + 1);
		}

		for (int i = 0; i < str2.length(); i++) {
			str2CharCount.put(str2.charAt(i), str2CharCount.getOrDefault(str2.charAt(i), 0) + 1);
		}

		for (Map.Entry<Character, Integer> map : str1CharCount.entrySet()) {
			Character key = map.getKey();
			if (str2CharCount.get(key) != map.getValue()) {
				isAnagram = "NO";
				break;
			}
		}

		if (str2CharCount.size() != str1CharCount.size()) {
			isAnagram = "NO";
		}

		return isAnagram;
	}
}
