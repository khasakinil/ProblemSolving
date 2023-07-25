package com.ds.ps;

public class IndexOfExtraElement {
	public static void main(String args[]) {
		int arr1[] = { 2, 4, 6, 8, 9, 10, 12 };
		int arr2[] = { 2, 4, 6, 8, 10, 12 };
		int indexOfExtraElement = getIndexOfExtraElement(arr1, arr2);
		System.out.println("IndexOfExtraElement : " + indexOfExtraElement);
	}

	private static int getIndexOfExtraElement(int[] arr1, int[] arr2) {

		boolean allIterated = false;
		int minLength = arr1.length < arr2.length ? arr1.length : arr2.length;

		for (int i = 0; i < minLength; i++) {
			if (arr1[i] != arr2[i]) {
				return i;
			}
			
			if(i==minLength-1) {
				allIterated = true;
			}
		}
		
		if(allIterated && arr1.length!=arr2.length) {
			return minLength;
		}
		
		return 0;
	}
}
