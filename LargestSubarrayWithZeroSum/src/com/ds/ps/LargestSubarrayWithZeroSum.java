package com.ds.ps;

public class LargestSubarrayWithZeroSum {
	public static void main(String args[]) {
		int[] numList = { 15, -2, 2, -8, 1, 7, 10, 23 };
		int largestSubarrayWithZeroSum = getLargestSubarrayWithZeroSum(numList);
		System.out.println("LargestSubarrayWithZeroSum : " + largestSubarrayWithZeroSum);
	}

	private static int getLargestSubarrayWithZeroSum(int[] numList) {
		int index = 0;
		for (int i = numList.length - 1; i >= 0; i--) {
			int sum = 0;
			int count = 0;
			for (int j = i; j >= 0; j--) {
				sum += numList[j];
				count++;
				if (sum == 0) {
					if (index < count) {
						index = count;
					}
				}
			}
		}
		return index;
	}
}
