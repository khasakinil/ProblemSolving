package com.ds.ps;

public class FrequenciesOfLimitedRangeArrayElements {
	public static void main(String args[]) {
		int arr[] = { 2, 3, 2, 3, 5 };
		int[] frequencyRange = getFrequenciesOfLimitedRangeArrayElements(arr);

		for (int i = 0; i < frequencyRange.length; i++) {
			System.out.println("FrequencyRange : " + frequencyRange[i]);
		}
	}

	private static int[] getFrequenciesOfLimitedRangeArrayElements(int[] arr) {
		int[] response = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			response[arr[i] - 1] = response[arr[i] - 1] + 1;
		}

		return response;
	}
}
