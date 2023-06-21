package com.ds.ps;

import java.util.ArrayList;

public class LeadersInAnArray {
	public static void main(String args[]) {
		int arr[] = { 16, 17, 4, 3, 5, 2 };
		ArrayList<Integer> leaders = getAllLeaders(arr);
		System.out.println("Leaders : " + leaders);
	}

	private static ArrayList<Integer> getAllLeaders(int[] arr) {
		ArrayList<Integer> leadersList = new ArrayList<>();
		int lastMax = Integer.MIN_VALUE;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (lastMax <= arr[i]) {
				leadersList.add(0, arr[i]);
				lastMax = arr[i];
			}
		}
		return leadersList;
	}
}
