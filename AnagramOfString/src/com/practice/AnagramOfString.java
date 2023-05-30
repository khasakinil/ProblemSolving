package com.practice;

import java.util.HashMap;
import java.util.Map;

public class AnagramOfString {
	public static void main(String args[]) {
		String str1 = "cddgk";
		String str2 = "gcd";
		int minumumDeletion = getMinumumNumberOfCharacterToBeDeletedForAnagram(str1, str2);
		System.out.println("MinumumDeletion : " + minumumDeletion);
	}

	private static int getMinumumNumberOfCharacterToBeDeletedForAnagram(String str1, String str2) {
		Map<Character, Integer> str1Map = new HashMap<Character, Integer>();
		Map<Character, Integer> str2Map = new HashMap<Character, Integer>();

		int minDeletion = 0;

		for (int i = 0; i < str1.length(); i++) {
			str1Map.put(str1.charAt(i), str1Map.getOrDefault(str1.charAt(i), 0) + 1);
		}

		for (int i = 0; i < str2.length(); i++) {
			str2Map.put(str2.charAt(i), str2Map.getOrDefault(str2.charAt(i), 0) + 1);
		}

		for (Map.Entry<Character, Integer> map : str1Map.entrySet()) {
			if (str2Map.get(map.getKey()) != null) {
				minDeletion += Math.abs(map.getValue() - str2Map.get(map.getKey()));
				str2Map.remove(map.getKey());
			} else {
				minDeletion += Math.abs(map.getValue());
			}
		}

		for (Map.Entry<Character, Integer> map : str2Map.entrySet()) {
			minDeletion += map.getValue();
		}

		return minDeletion;
	}
}
