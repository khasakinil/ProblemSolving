package com.ds.ps;

public class WaveArray {
	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int[] waveArray = getWaveArray(arr);
		System.out.println("WaveArray :  " + waveArray);
		for (int i = 0; i < waveArray.length; i++) {
			System.out.println(" " + waveArray[i]);
		}
	}

	private static int[] getWaveArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				int temp = arr[i - 1];
				arr[i - 1] = arr[i];
				arr[i] = temp;
			}
		}
		return arr;
	}
}
