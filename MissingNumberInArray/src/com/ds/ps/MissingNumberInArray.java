package com.ds.ps;

public class MissingNumberInArray {
	public static void main(String args[]) {
		int[] numList = { 6, 1, 2, 8, 3, 4, 7, 10, 5 };
		int missingNumber = getMissingNumberInArray(numList);
		System.out.println("MissingNumber : " + missingNumber);
	}

	private static int getMissingNumberInArray(int[] numList) {
		int totalSum = 0;
		int listSum = 0;
		int i = 0;
		for (i = 0; i < numList.length; i++) {
			totalSum += (i + 1);
			listSum += numList[i];
		}
		totalSum += (i + 1);
		return totalSum - listSum;
	}
}
