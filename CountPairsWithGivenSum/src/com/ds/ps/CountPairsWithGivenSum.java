package com.ds.ps;

import java.util.HashMap;
import java.util.Map;

public class CountPairsWithGivenSum {
	public static void main(String args[]) {
		int arr[] = { 1, 5, 7, 1, -1 };
		int sum = 6;
		int pairCount = getPairsCount(arr, sum);
		System.out.println("PairCount : " + pairCount);
	}

	private static int getPairsCount(int[] arr, int sum) {
		Map<Integer, Integer> numCount = new HashMap<>();
		int pairCount = 0;
		for (int i = 0; i < arr.length; i++) {
			numCount.put(arr[i], numCount.getOrDefault(arr[i], 0) + 1);
		}

		for (Map.Entry<Integer, Integer> map : numCount.entrySet()) {
			if (numCount.containsKey(map.getKey() - sum) && (map.getKey() - sum != map.getKey())) {
				pairCount++;
			} else if (map.getKey() - sum != map.getKey()) {
				int val = getFact(map.getValue() - 1);
				pairCount += val;
			}
		}

		return pairCount;
	}

	private static int getFact(int num) {
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
