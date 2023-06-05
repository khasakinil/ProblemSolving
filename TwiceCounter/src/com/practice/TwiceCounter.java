package com.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwiceCounter {
	public static void main(String args[]) {

		List<String> input = Arrays
				.asList(new String[] { "Tom", "Jerry", "Thomas", "To", "Jerry", "Courage", "Tom", "Courage" });
		int totalTwiceCounter = getTotalTwiceCounter(input);
		System.out.println("totalTwiceCounter : " + totalTwiceCounter);
	}

	private static int getTotalTwiceCounter(List<String> input) {
		Map<String, Integer> strCount = new HashMap<>();
		int count = 0;

		for (String str : input) {
			strCount.put(str, strCount.getOrDefault(str, 0) + 1);
		}

		for (Map.Entry<String, Integer> map : strCount.entrySet()) {
			if (map.getValue() == 2) {
				count++;
			}
		}
		return count;
	}
}
