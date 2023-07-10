package com.ds.ps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllPairsWithGivenSum {
	public static void main(String args[]) {
		int arr1[] = { 1, 2, 4, 5, 7 };
		int arr2[] = { 5, 6, 3, 4, 8 };
		int s = 9;
		List<List<Integer>> pairList = getAllPairsWithGivenSum(arr1, arr2, s);
		System.out.println("PairList : " + pairList);
	}

	private static List<List<Integer>> getAllPairsWithGivenSum(int[] arr1, int[] arr2, int s) {
		Map<Integer, Integer> arr1Map = new HashMap<>();
		Map<Integer, Integer> arr2Map = new HashMap<>();
		List<List<Integer>> responseList = new ArrayList<>();
		for (int i = 0; i < arr1.length; i++) {
			arr1Map.put(arr1[i], arr1Map.getOrDefault(arr1[i], 0) + 1);
		}

		for (int i = 0; i < arr2.length; i++) {
			arr2Map.put(arr2[i], arr2Map.getOrDefault(arr2[i], 0) + 1);
		}

		for (Map.Entry<Integer, Integer> map : arr1Map.entrySet()) {
			if (arr2Map.containsKey(s - map.getKey())) {
				List<Integer> currentPair = new ArrayList<>();
				currentPair.add(map.getKey());
				currentPair.add(s - map.getKey());
				responseList.add(currentPair);
			}
		}

		return responseList;
	}
}
