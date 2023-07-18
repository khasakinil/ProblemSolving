package com.ds.ps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesInArray {
	public static void main(String args[]) {
		int arr[] = { 1, 2, 3 };
		ArrayList<Integer> duplicatesInArray = getDuplicateInArray(arr);
		System.out.println("DuplicatesInArray : " + duplicatesInArray);
	}

	private static ArrayList<Integer> getDuplicateInArray(int[] arr) {
		ArrayList<Integer> duplicateList = new ArrayList<>();
		Map<Integer, Integer> duplicateMap = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			duplicateMap.put(arr[i], duplicateMap.getOrDefault(arr[i], 0) + 1);
			if (duplicateMap.get(arr[i]) > 1 && !duplicateList.contains(arr[i])) {
				duplicateList.add(arr[i]);
			}
		}
		if (duplicateList.size() > 0) {
			return duplicateList;
		}
		duplicateList.add(-1);
		return duplicateList;
	}
}
