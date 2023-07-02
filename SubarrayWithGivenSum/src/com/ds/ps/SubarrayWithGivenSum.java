package com.ds.ps;

import java.util.ArrayList;

public class SubarrayWithGivenSum {
	public static void main(String args[]) {
		int[] arr = { 1, 2, 3, 7, 5 };
		int s = 12;
		ArrayList<Integer> subArrayList = getSubarrayWithGivenSum(arr, s);
		System.out.println("SubArrayList : " + subArrayList);
	}

	private static ArrayList<Integer> getSubarrayWithGivenSum(int[] arr, int s) {

		ArrayList<Integer> subArrayList = new ArrayList<>();
		int arrSum = 0;
		int i = -1;
		int j = 0;

		while (j <= arr.length && j >= i) {

			if (arrSum == s) {
				subArrayList.add(i + 2);
				subArrayList.add(j);
				return subArrayList;
			}

			if (arrSum > s) {
				arrSum -= arr[++i];
				continue;
			}
			arrSum += arr[j];
			j++;
		}

		subArrayList.add(-1);
		return subArrayList;
	}
}
