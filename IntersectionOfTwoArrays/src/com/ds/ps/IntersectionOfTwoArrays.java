package com.ds.ps;

import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArrays {
	public static void main(String args[]) {
		int arr1[] = { 1, 2, 3, 4, 5, 6 };
		int arr2[] = { 7 };

		int intersectionOfTwoArrays = getCountIntersectionOfTwoArrays(arr1, arr2);
		System.out.println("IntersectionOfTwoArrays : " + intersectionOfTwoArrays);
	}

	private static int getCountIntersectionOfTwoArrays(int[] arr1, int[] arr2) {
		Map<Integer, Integer> arr1Map = new HashMap<>();
		Map<Integer, Integer> arr2Map = new HashMap<>();

		int intersection = 0;

		for (int i = 0; i < arr1.length; i++) {
			arr1Map.put(arr1[i], arr1Map.getOrDefault(arr1[i], 0) + 1);
		}

		for (int i = 0; i < arr2.length; i++) {
			arr2Map.put(arr2[i], arr2Map.getOrDefault(arr2[i], 0) + 1);
		}

		for (Map.Entry<Integer, Integer> map : arr1Map.entrySet()) {
			if (arr2Map.containsKey(map.getKey())) {
				intersection++;
			}
		}

		return intersection;
	}
}
