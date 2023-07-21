package com.ds.ps;

import java.util.HashMap;
import java.util.Map;

public class MinimumDistanceBetweenTwoNumbers {
	public static void main(String args[]) {
		int arr[] = { 96, 82, 48, 76, 34, 19, 7, 80, 36, 57, 77, 34, 19, 35, 5, 57, 16, 66, 42, 62, 89, 19, 60, 19, 25,
				16, 20, 51, 77, 75, 12, 73, 8, 11, 100, 93, 81, 58, 72, 17, 14, 48, 2, 33, 82, 6, 41, 49, 72, 34, 10,
				12, 53, 21, 30, 77, 36, 49, 79, 13, 75, 42 };
		int num1 = 36;
		int num2 = 33;
		int minimumDistanceBetweenTwoNumbers = getMinimumDistanceBetweenTwoNumbers(arr, num1, num2);
		System.out.println("MinimumDistanceBetweenTwoNumbers : " + minimumDistanceBetweenTwoNumbers);
	}

	private static int getMinimumDistanceBetweenTwoNumbers(int[] arr, int num1, int num2) {
		Map<Integer, Integer> numMap = new HashMap<>();
		numMap.put(num1, Integer.MIN_VALUE);
		numMap.put(num2, Integer.MIN_VALUE);
		int minDistance = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (num1 == arr[i]) {
				numMap.put(num1, i);
			}

			if (num2 == arr[i]) {
				numMap.put(num2, i);
			}

			if (numMap.get(num1) != Integer.MIN_VALUE && numMap.get(num2) != Integer.MIN_VALUE) {

				minDistance = minDistance > Math.abs(numMap.get(num1) - numMap.get(num2))
						? Math.abs(numMap.get(num1) - numMap.get(num2))
						: minDistance;
			}
		}

		if (minDistance == Integer.MAX_VALUE) {
			return -1;
		}

		return minDistance;
	}
}
