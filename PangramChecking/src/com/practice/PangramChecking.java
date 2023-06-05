package com.practice;

import java.util.HashMap;
import java.util.Map;

public class PangramChecking {
	public static void main(String args[]) {

		String input = "Bawds jog, flick quartz, vex nymph";
		boolean isPangram = checkIsPangram(input);
		System.out.println("isPangram : " + isPangram);
	}

	private static boolean checkIsPangram(String input) {
		Map<String, Integer> charMap = new HashMap<String, Integer>();

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) > 64 && input.charAt(i) < 91 || input.charAt(i) > 96 && input.charAt(i) < 123) {
				charMap.put(String.valueOf(input.charAt(i)).toLowerCase(),
						charMap.getOrDefault(input.charAt(i), 0) + 1);
			}
		}

		if (charMap.size() == 26) {
			return true;
		}
		return false;
	}

}
