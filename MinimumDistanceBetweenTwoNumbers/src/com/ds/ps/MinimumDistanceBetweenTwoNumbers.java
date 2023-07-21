package com.ds.ps;

import java.util.HashMap;
import java.util.Map;

public class MinimumDistanceBetweenTwoNumbers {
	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 2 };
		int num1 = 42;
		int num2 = 12;
		int minimumDistanceBetweenTwoNumbers = getMinimumDistanceBetweenTwoNumbers(arr, num1, num2);
		System.out.println("MinimumDistanceBetweenTwoNumbers : " + minimumDistanceBetweenTwoNumbers);
	}

	private static int getMinimumDistanceBetweenTwoNumbers(int[] arr, int num1, int num2) {
		Map<Integer, Integer> numMap = new HashMap<>();
		numMap.put(num1, Integer.MIN_VALUE);
		numMap.put(num2, Integer.MIN_VALUE);

		for (int i = 0; i < arr.length; i++) {
			if (num1 == arr[i]) {
				numMap.put(num1, i);
			}

			if (num2 == arr[i]) {
				numMap.put(num2, i);
			}

			if (numMap.get(num1) != Integer.MIN_VALUE && numMap.get(num2) != Integer.MIN_VALUE) {
				return Math.abs(numMap.get(num1) - numMap.get(num2));
			}

		}
		return -1;
	}
}
