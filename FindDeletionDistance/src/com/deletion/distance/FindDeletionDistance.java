package com.deletion.distance;

import java.util.HashMap;
import java.util.Map;

public class FindDeletionDistance {

	public static void main(String[] args) {
		String value1 = "ALGO";
		String value2 = "DAILY";

		int distance = getDeletionDistance(value1, value2);
		System.out.println("Distance : " + distance);
	}

	private static int getDeletionDistance(String value1, String value2) {

		Map<Character, Integer> firstStringMap = new HashMap<Character, Integer>();
		Map<Character, Integer> secondStringMap = new HashMap<Character, Integer>();
		int distance = 0;

		for (int i = 0; i < value1.length(); i++) {
			firstStringMap.put(value1.charAt(i), firstStringMap.getOrDefault(value1.charAt(i), 0) + 1);
		}

		for (int i = 0; i < value2.length(); i++) {
			secondStringMap.put(value2.charAt(i), secondStringMap.getOrDefault(value2.charAt(i), 0) + 1);
		}

		for (Map.Entry<Character, Integer> map : firstStringMap.entrySet()) {
			distance += Math.abs(map.getValue() - secondStringMap.getOrDefault(map.getKey(), 0));
			secondStringMap.remove(map.getKey());
		}

		for (Map.Entry<Character, Integer> map : secondStringMap.entrySet()) {
			distance += Math.abs(map.getValue());
		}

		return distance;
	}

}
