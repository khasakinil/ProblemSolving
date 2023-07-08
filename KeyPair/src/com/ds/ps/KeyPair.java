package com.ds.ps;

import java.util.HashMap;
import java.util.Map;

public class KeyPair {
	public static void main(String args[]) {
		int arr[] = { 1, 2, 5, 6, 7 };
		int x = 4;
		boolean status = hasArrayTwoCandidates(arr, x);
		System.out.println("status :  " + status);
	}

	private static boolean hasArrayTwoCandidates(int[] arr, int x) {
		Map<Integer, Integer> numMap = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			numMap.put(arr[i], numMap.getOrDefault(arr[i], 0) + 1);
		}

		for (Map.Entry<Integer, Integer> map : numMap.entrySet()) {
			if (numMap.containsKey(x - map.getKey()) && map.getValue() >= 2) {
				return true;
			}
			if (numMap.containsKey(x - map.getKey()) && map.getKey() != (x - map.getKey())) {
				return true;
			}
		}

		return false;
	}
}
