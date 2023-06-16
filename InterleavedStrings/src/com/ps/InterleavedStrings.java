package com.ps;

import java.util.HashMap;
import java.util.Map;

public class InterleavedStrings {
	public static void main(String args[]) {
		String input1 = "YX";
		String input2 = "X";
		String output = "XXY";

		boolean isInterLeave = isInterLeaveString(input1, input2, output);
		System.out.println("isInterLeav : " + isInterLeave);
	}

	private static Boolean isInterLeaveString(String input1, String input2, String output) {

		if (input1.length() + input2.length() != output.length()) {
			return false;
		}

		Map<Character, Integer> charMapInput = new HashMap<>();
		Map<Character, Integer> charMapOutput = new HashMap<>();

		for (int i = 0; i < input1.length(); i++) {
			charMapInput.put(input1.charAt(i), charMapInput.getOrDefault(input1.charAt(i), 0) + 1);
		}

		for (int i = 0; i < input2.length(); i++) {
			charMapInput.put(input2.charAt(i), charMapInput.getOrDefault(input2.charAt(i), 0) + 1);
		}

		for (int i = 0; i < output.length(); i++) {
			charMapOutput.put(output.charAt(i), charMapOutput.getOrDefault(output.charAt(i), 0) + 1);
		}

		for (Map.Entry<Character, Integer> charMap : charMapOutput.entrySet()) {
			if (charMap.getValue() != charMapInput.get(charMap.getKey())) {
				return false;
			}
		}

		return true;
	}
}
