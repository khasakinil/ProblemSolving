package com.duplicate;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumberInArray {
	public static void main(String args[]) {
		int arr[] = { 1, 1, 2, 3, 5, 6, 7, 8, 11, 4, 3, 3, 11 };

		findDuplicateInArray(arr);
	}

	private static void findDuplicateInArray(int[] arr) {
		Map<Integer, Integer> duplicateList = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			duplicateList.put(arr[i], duplicateList.getOrDefault(arr[i], 0) + 1);
		}

		for (Map.Entry<Integer, Integer> map : duplicateList.entrySet()) {
			if (map.getValue() > 1) {
				System.out.println("Duplicate Number : " + map.getKey());
			}
		}
	}
}
