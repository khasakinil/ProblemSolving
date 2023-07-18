package com.ds.ps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class FindDuplicatesInArray {
	public static void main(String args[]) {
		int arr[] = { 1, 2, 3 };
		ArrayList<Integer> duplicatesInArray = getDuplicateInArray(arr);
		System.out.println("DuplicatesInArray : " + duplicatesInArray);
	}

	private static ArrayList<Integer> getDuplicateInArray(int[] arr) {
		Set<Integer> duplicateSet = new TreeSet<>();
		ArrayList<Integer> duplicateList = new ArrayList<>();
		Map<Integer, Integer> duplicateMap = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			duplicateMap.put(arr[i], duplicateMap.getOrDefault(arr[i], 0) + 1);
			if (duplicateMap.get(arr[i]) > 1 && !duplicateSet.contains(arr[i])) {
				duplicateSet.add(arr[i]);
			}
		}
		if (duplicateSet.size() > 0) {
			for (Integer num : duplicateSet) {
				duplicateList.add(num);
			}
			return duplicateList;
		}
		duplicateList.add(-1);
		return duplicateList;
	}
}
