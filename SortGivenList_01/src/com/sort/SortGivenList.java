package com.sort;

public class SortGivenList {

	public static void main(String[] args) {
		int[] numList = { 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1 };

		int onesPointer = numList.length - 1;
		int zerosPointer = 0;

		for (int i = 0; i < numList.length; i++) {
			if (numList[i] == 0) {
				if (i != zerosPointer) {
					int temp = numList[zerosPointer];
					numList[zerosPointer] = numList[i];
					numList[i] = temp;
				}
				zerosPointer++;
			}

			if (numList[i] == 2) {
				if (i != onesPointer) {
					int temp = numList[onesPointer];
					numList[onesPointer] = numList[i];
					numList[i] = temp;
				}
				onesPointer--;
			}
		}

		for (Integer num : numList) {
			System.out.println(num);
		}
	}

}
