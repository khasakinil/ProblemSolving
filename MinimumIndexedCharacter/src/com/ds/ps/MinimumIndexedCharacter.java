package com.ds.ps;

import java.util.HashMap;

public class MinimumIndexedCharacter {
	public static void main(String[] args) {
		String input1 = "";
		String input2 = "";
		int minimumIndexedCharacter = getMinimumIndexedCharacter(input1, input2);
		System.out.println("MinimumIndexedCharacter : " + minimumIndexedCharacter);
	}

	private static int getMinimumIndexedCharacter(String input1, String input2) {

		HashMap<Character, Integer> input1HashMap = new HashMap<>();
		HashMap<Character, Integer> input2HashMap = new HashMap<>();

		for (int i = 0; i < input1.length(); i++) {
			input1HashMap.put(input1.charAt(i), input1HashMap.getOrDefault(input1.charAt(i), 0) + 1);
		}

		for (int i = 0; i < input2.length(); i++) {
			input2HashMap.put(input2.charAt(i), input2HashMap.getOrDefault(input2.charAt(i), 0) + 1);
		}

		return 0;
	}
}
