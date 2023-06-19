package com.ds.ps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MinimumIndexedCharacter {
	public static void main(String[] args) {
		String input1 = "adcffaet";
		String input2 = "onkl";
		int minimumIndexedCharacter = getMinimumIndexedCharacter(input1, input2);
		System.out.println("MinimumIndexedCharacter : " + minimumIndexedCharacter);
	}

	private static int getMinimumIndexedCharacter(String input1, String input2) {

		Map<Character, Integer> input1HashMap = new LinkedHashMap<>();
		Map<Character, Integer> input2HashMap = new LinkedHashMap<>();

		for (int i = 0; i < input1.length(); i++) {
			input1HashMap.put(input1.charAt(i), input1HashMap.getOrDefault(input1.charAt(i), 0) + 1);
		}

		for (int i = 0; i < input2.length(); i++) {
			input2HashMap.put(input2.charAt(i), input2HashMap.getOrDefault(input2.charAt(i), 0) + 1);
		}

		int count1 = 0;
		int count2 = 0;
		boolean input1Status = false;
		boolean input2Status = false;

		for (Map.Entry<Character, Integer> map : input1HashMap.entrySet()) {
			count1++;
			if (input2HashMap.containsKey(map.getKey())) {
				input1Status = true;
				break;
			}
		}

		for (Map.Entry<Character, Integer> map : input2HashMap.entrySet()) {
			count2++;
			if (input1HashMap.containsKey(map.getKey())) {
				input2Status = true;
				break;
			}
		}

		if (input1Status && input2Status && count1 != 0 && count2 != 0) {
			return count1 < count2 ? count1 : count2;
		}

		return -1;
	}
}
