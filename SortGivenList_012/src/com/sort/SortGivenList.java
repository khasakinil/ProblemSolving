package com.sort;

public class SortGivenList {

	public static void main(String[] args) {
		int[] numList = { 0, 1, 2, 2, 1, 0 };

		int twosPointer = numList.length - 1;
		int zerosPointer = 0;

		for (int i = 0; i < numList.length; i++) {
			if (numList[i] == 0) {

				zerosPointer = getNextZerosPointer(numList, zerosPointer);

				if (i != zerosPointer && i > zerosPointer) {
					int temp = numList[zerosPointer];
					numList[zerosPointer] = numList[i];
					numList[i] = temp;
					zerosPointer++;
				}
			}

			if (numList[i] == 2) {

				twosPointer = getNextTwoPointer(numList, twosPointer);

				if (i != twosPointer && i < twosPointer) {
					int temp = numList[twosPointer];
					numList[twosPointer] = numList[i];
					numList[i] = temp;
					twosPointer--;
				}

				if (numList[i] == 0) {
					i--;
				}
			}
		}

		for (Integer num : numList) {
			System.out.print(num + " ");
		}
	}

	private static int getNextZerosPointer(int[] numList, int zerosPointer) {
		int nextZerosPointer = zerosPointer;

		boolean status = false;

		if (numList[zerosPointer] == 0) {
			status = true;
		}

		for (int i = zerosPointer; i < numList.length; i++) {
			if (numList[i] == 0 && status) {
				nextZerosPointer++;
			} else {
				status = false;
			}
		}

		return nextZerosPointer;
	}

	private static int getNextTwoPointer(int[] numList, int twosPointer) {
		int nextTwosPointer = twosPointer;

		boolean status = false;

		if (numList[twosPointer] == 2) {
			status = true;
		}

		for (int i = twosPointer; i >= 0; i--) {
			if (numList[i] == 2 && status) {
				nextTwosPointer--;
			} else {
				status = false;
			}
		}

		return nextTwosPointer;
	}

}
