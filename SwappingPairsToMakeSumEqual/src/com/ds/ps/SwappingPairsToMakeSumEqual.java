package com.ds.ps;

import java.util.HashMap;
import java.util.Map;

public class SwappingPairsToMakeSumEqual {
	public static void main(String args[]) {
		long arr1[] = { 4, 1, 2, 1, 1, 2 };
		long arr2[] = { 3, 6, 3, 3, 5 };
		long isSwapMakeSumEqual = isSwappingPairsToMakeSumEqual(arr1, arr2);
		System.out.println("isSwapMakeSumEqual : " + isSwapMakeSumEqual);
	}

	private static long isSwappingPairsToMakeSumEqual(long[] arr1, long[] arr2) {

		long arr1Sum = 0;
		long arr2Sum = 0;

		Map<Integer, Integer> map1Arr = new HashMap<>();
		Map<Integer, Integer> map2Arr = new HashMap<>();

		for (int i = 0; i < arr1.length; i++) {
			arr1Sum += arr1[i];
			map1Arr.put((int) arr1[i], map1Arr.getOrDefault(arr1[i], 0) + 1);
		}

		for (int i = 0; i < arr2.length; i++) {
			arr2Sum += arr2[i];
			map2Arr.put((int) arr2[i], map2Arr.getOrDefault(arr2[i], 0) + 1);
		}

		for(Map.Entry<Integer, Integer> map : map1Arr.entrySet()) {
		}
		
		return 0;
	}
}
