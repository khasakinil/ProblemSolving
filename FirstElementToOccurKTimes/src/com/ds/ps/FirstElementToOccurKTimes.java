package com.ds.ps;

import java.util.HashMap;
import java.util.Map;

public class FirstElementToOccurKTimes {
	public static void main(String args[]) {
		int[] arr = { 1, 7, 4, 3, 4, 8, 7 };
		int k = 2;
		int firstElementOccurence = getFirstElementToOccurKTimes(arr, k);
		System.out.println("FirstElementOccurence : " + firstElementOccurence);
	}

	private static int getFirstElementToOccurKTimes(int[] arr, int k) {
		Map<Integer, Integer> countMap = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			countMap.put(arr[i], countMap.getOrDefault(arr[i], 0) + 1);
			if (countMap.get(arr[i]) == k) {
				return arr[i];
			}
		}

		return -1;
	}
}
