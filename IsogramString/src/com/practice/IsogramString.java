package com.practice;

import java.util.HashMap;
import java.util.Map;

public class IsogramString {
	public static void main(String args[]) {
		String str = "masschine";
		boolean isogramString = isIsogramString(str);
		System.out.println("IsIsogramString : " + isogramString);
	}

	private static boolean isIsogramString(String str) {
		Map<Character, Integer> isogramMap = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			if (isogramMap.get(str.charAt(i)) == null) {
				isogramMap.put(str.charAt(i), 1);
				continue;
			}
			return false;
		}

		return true;
	}
}
