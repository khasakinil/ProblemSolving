package com.ds.ps;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeIntegerInEveryWindowSize {
	public static void main(String args[]) {
		long arr[] = { -8, 2, 3, -6, 10 };
		int k = 2;
		List<Long> firstNegativeInWindow = getFirstNegativeIntegerInEveryWindowSize(arr, k);
		System.out.println("FirstNegativeInWindow : " + firstNegativeInWindow);
	}

	private static List<Long> getFirstNegativeIntegerInEveryWindowSize(long[] arr, int k) {
		List<Long> firstNegativeInWindow = new ArrayList<>();

		for (long i = 0; i < arr.length; i++) {
			if (k + i >= arr.length) {
				break;
			}
			long small = 0;
			for (long j = i; j <= i + k; j++) {
				if (arr[(int) j] < 0) {
					small = arr[(int) j];
				}
			}
			firstNegativeInWindow.add(small);
		}

		return firstNegativeInWindow;
	}
}
