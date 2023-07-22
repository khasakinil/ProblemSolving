package com.ds.ps;

public class LargestElementInArray {
	public static void main(String args[]) {
		int arr[] = { 1, 8, 7, 56, 90 };
		int largestElementInArray = getLargestElementInArray(arr);
		System.out.println("LargestElementInArray : " + largestElementInArray);
	}

	private static int getLargestElementInArray(int[] arr) {
		int maxNum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (maxNum < arr[i]) {
				maxNum = arr[i];
			}
		}
		return maxNum;
	}
}
