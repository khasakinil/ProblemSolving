package com.sort;

public class SortGivenList {

	public static void main(String[] args) {
		int[] numList = { 1, 1, 0, 2, 1, 0, 1, 2, 2, 1, 1, 0 };

		int twosPointer = numList.length - 1;
		int zerosPointer = 0;

		for (int i = 0; i < numList.length; i++) {
			if (numList[i] == 0 && i > zerosPointer) {
				if (i != zerosPointer) {
					int temp = numList[zerosPointer];
					numList[zerosPointer] = numList[i];
					numList[i] = temp;
				}
				zerosPointer++;
			}

			if (numList[i] == 2 && i < twosPointer) {
				if (i != twosPointer) {
					int temp = numList[twosPointer];
					numList[twosPointer] = numList[i];
					numList[i] = temp;
				}
				twosPointer--;

				if (numList[i] == 0) {
					i--;
				}
			}
		}

		for (Integer num : numList) {
			System.out.println(num);
		}
	}

}
