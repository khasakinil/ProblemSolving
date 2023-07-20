package com.ds.ps;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
	public static void main(String args[]) {
		String input = "zxvczbtxyzvy";
		char nonRepeatingCharacter = getFirstNonRepeatingCharacter(input);
		System.out.println("FirstNonRepeatingCharacter : " + nonRepeatingCharacter);
	}

	private static char getFirstNonRepeatingCharacter(String input) {
		Map<Character, Integer> charMap = new LinkedHashMap();

		for (int i = 0; i < input.length(); i++) {
			charMap.put(input.charAt(i), charMap.getOrDefault(input.charAt(i), 0) + 1);
		}

		for (Map.Entry map : charMap.entrySet()) {
			if (Integer.parseInt(map.getValue().toString()) == 1) {
				return (char) map.getKey();
			}
		}

		return '$';
	}
}
