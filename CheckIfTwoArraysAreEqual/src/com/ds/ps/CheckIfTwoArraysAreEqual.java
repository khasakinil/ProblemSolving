package com.ds.ps;

import java.util.HashMap;
import java.util.Map;

public class CheckIfTwoArraysAreEqual {
	public static void main(String args[]) {
		long arr1[] = { 16, 1, 2, 14, 13, 17, 1 };
		long arr2[] = { 14, 1, 16, 2, 13, 2, 17 };

		boolean isTwoArraysEqual = getTwoArraysEqualityStatus(arr1, arr2);
		System.out.println("IsTwoArraysEqual : " + isTwoArraysEqual);
	}

	private static boolean getTwoArraysEqualityStatus(long[] arr1, long[] arr2) {

		Map<Integer, Integer> arr1Map = new HashMap<>();
		Map<Integer, Integer> arr2Map = new HashMap<>();

		for (int i = 0; i < arr1.length; i++) {
			arr1Map.put((int) arr1[i], arr1Map.getOrDefault(arr1[i], 0) + 1);
		}

		for (int i = 0; i < arr2.length; i++) {
			arr2Map.put((int) arr2[i], arr2Map.getOrDefault(arr2[i], 0) + 1);
		}

		for (Map.Entry<Integer, Integer> map : arr1Map.entrySet()) {
			if (arr2Map.get(map.getKey()) == null || arr2Map.get(map.getKey()) != map.getValue()) {
				return false;
			}
			arr2Map.remove(map.getKey());
		}

		if (arr2Map.size() != 0) {
			return false;
		}

		return true;
	}
}
