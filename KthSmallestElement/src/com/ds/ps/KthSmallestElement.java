package com.ds.ps;

public class KthSmallestElement {
	public static void main(String args[]) {
		int arr[] = { 7, 10, 4, 20, 15 };
		int k = 5;

		int kthSmallestElemet = getKthSmallestElement(arr, k);
		System.out.println("KthSmallestElemet : " + kthSmallestElemet);
	}

	private static int getKthSmallestElement(int[] arr, int k) {

		if (k <= arr.length) {
			for (int i = 0; i < k; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}
		return arr[k - 1];
	}
}
