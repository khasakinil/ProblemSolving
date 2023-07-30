package com.ds.ps;

public class CounTheZeros {
	public static void main(String args[]) {
		int arr[] = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 };
		int zeroCount = getAllZeroCounts(arr);
		System.out.println("ZeroCount : " + zeroCount);
	}

	private static int getAllZeroCounts(int[] arr) {
		int zeroCount = 0;

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == 0) {
				zeroCount++;
			}
		}
		return zeroCount;
	}
}
