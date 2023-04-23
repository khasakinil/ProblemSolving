package com.dsa;

import java.util.HashSet;
import java.util.Set;

public class LargestMissingPositiveNumber {

	public static void main(String args[]) {
		int numberArr[] = { 2, 3, 7, 6, 8 };
		int maxNumber = 0;
		Set<Integer> numSet = new HashSet();

		for (int i = 0; i < numberArr.length; i++) {
			numSet.add(numberArr[i]);
			if (numberArr[i] > maxNumber) {
				maxNumber = numberArr[i];
			}
		}

		for (int i = 0; i < numberArr.length; i++) {
			if (!numSet.contains(maxNumber)) {
				if (maxNumber != 0) {
					System.out.println(maxNumber);
					break;
				} else {
					System.out.println("-1");
				}
			}
			maxNumber--;
		}

	}
}
