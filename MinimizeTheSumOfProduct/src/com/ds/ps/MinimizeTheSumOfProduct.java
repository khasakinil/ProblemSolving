package com.ds.ps;

public class MinimizeTheSumOfProduct {
	public static void main(String args[]) {
		long arr1[] = { 7, 18, 16, 14, 2 };
		long arr2[] = { 16, 7, 13, 10, 3 };
		long minimumProduct = minimizeTheSumOfProduct(arr1, arr2);
		System.out.println("MinimumProduct : " + minimumProduct);
	}

	private static long minimizeTheSumOfProduct(long[] arr1, long[] arr2) {

		// implement with quick sort algorithm to minimize the time complexity

		long minimizedProduct = 0;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] > arr1[j]) {
					long temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}

		for (int i = 0; i < arr2.length; i++) {
			for (int j = i + 1; j < arr2.length; j++) {
				if (arr2[i] < arr2[j]) {
					long temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}

		for (int i = 0; i < arr1.length; i++) {
			minimizedProduct += (arr1[i] * arr2[i]);
		}

		return minimizedProduct;
	}
}
