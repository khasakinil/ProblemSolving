package com.ds.ps;

public class SearchingNumber {
	public static void main(String args[]) {
		int arr[] = { 9, 7, 2, 16, 4 };
		int k = 16;
		int indexOfElement = getIndexSearchingNumber(arr, k);
		System.out.println("IndexOfElement : " + indexOfElement);
	}

	private static int getIndexSearchingNumber(int[] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				return ++i;
			}
		}
		return -1;
	}
}
