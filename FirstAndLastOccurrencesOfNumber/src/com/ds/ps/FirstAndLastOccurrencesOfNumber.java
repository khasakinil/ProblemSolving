package com.ds.ps;

import java.util.ArrayList;

public class FirstAndLastOccurrencesOfNumber {
	public static void main(String args[]) {
		long arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
		int num = 5;
		ArrayList<Long> firstAndLastOccurrencesOfNumber = getFirstAndLastOccurrencesOfNumber(arr, num);
		System.out.println("FirstAndLastOccurrencesOfNumber : " + firstAndLastOccurrencesOfNumber);
	}

	private static ArrayList<Long> getFirstAndLastOccurrencesOfNumber(long[] arr, int num) {

		ArrayList<Long> occurences = new ArrayList<>();
		long secondOcc = 0;
		for (long i = 0; i < arr.length; i++) {
			if (arr[(int) i] == num) {
				if (occurences.size() == 0) {
					occurences.add(i);
				}
				secondOcc = i;
			}
		}

		if (secondOcc != 0 && occurences.size() > 0) {
			occurences.add(secondOcc);
			return occurences;
		}

		return null;
	}
}
