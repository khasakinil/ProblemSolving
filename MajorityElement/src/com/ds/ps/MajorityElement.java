package com.ds.ps;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	public static void main(String args[]) {
		int arr[] = { 3,1,3,3,2 };
		int majorityElement = getMajorityElement(arr);
		System.out.println("MajorityElement : " + majorityElement);
	}

	private static int getMajorityElement(int[] arr) {
		int maxCount = 1;
		int majorElement = -1;
		int max = arr.length / 2;
		Map<Integer, Integer> mapElements = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			mapElements.put(arr[i], mapElements.getOrDefault(arr[i], 0) + 1);
			if (mapElements.get(arr[i]) > max) {
				if (maxCount < mapElements.get(arr[i])) {
					maxCount = mapElements.get(arr[i]);
					majorElement = arr[i];
				}
			}
		}
		if(arr.length==1) {
			return arr[0];
		}
		return majorElement;
	}
}
