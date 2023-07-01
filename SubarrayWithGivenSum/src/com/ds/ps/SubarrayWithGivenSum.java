package com.ds.ps;

import java.util.ArrayList;

public class SubarrayWithGivenSum {
	public static void main(String args[]) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int s = 15;
		ArrayList<Integer> subArrayList = getSubarrayWithGivenSum(arr, s);
		System.out.println("SubArrayList : " + subArrayList);
	}

	private static ArrayList<Integer> getSubarrayWithGivenSum(int[] arr, int s) {

		ArrayList<Integer> subArrayList = new ArrayList<>();
		
		int arrSum = 0;
		int i = 0;
		int j = 0;
		
		while(j<arr.length) {
			arrSum+=arr[j];
			j++;
		}

		for (int i = 0; i < arr.length; i++) {
			int arrSum = 0;
			for (int j = i; j < arr.length; j++) {
				arrSum += arr[j];
				if (arrSum == s) {
					subArrayList.add(i + 1);
					subArrayList.add(j + 1);
					return subArrayList;
				}
				if (arrSum > s) {
					break;
				}
			}
		}

		subArrayList.add(-1);
		return subArrayList;
	}
}
