package com.ds.ps;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveAndReverse {
	public static void main(String args[]) {
		String input = "ccced";

		String repeatedCharReverse = getRepeatedCharReverse(input);
		System.out.println("repeatedCharReverse : " + repeatedCharReverse);
	}

	private static String getRepeatedCharReverse(String input) {

		StringBuilder sb = new StringBuilder();
		Map<Character, Integer> charMap = new LinkedHashMap<>();
		for (int i = input.length()-1; i >= 0; i--) {
			charMap.put(input.charAt(i), charMap.getOrDefault(input.charAt(i), 0) + 1);
		}

		int count =0;
		for (Map.Entry<Character, Integer> map : charMap.entrySet()) {
			if (map.getValue() %2 ==0) {
				sb.insert(count++, map.getKey());
			}else {
				
				sb.append(map.getKey());
			}
		}

		return sb.toString();
	}
}
