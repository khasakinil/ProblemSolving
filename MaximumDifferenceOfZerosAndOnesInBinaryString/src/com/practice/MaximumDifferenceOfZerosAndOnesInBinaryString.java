package com.practice;

public class MaximumDifferenceOfZerosAndOnesInBinaryString {
	public static void main(String args[]) {
		String str = "11000010001";
		int maxDiffInZeroAndOne = getMaximumDifferenceOfZerosAndOnesInBinaryString(str);

		System.out.println("maxDiffInZeroAndOne : " + maxDiffInZeroAndOne);
	}

	private static int getMaximumDifferenceOfZerosAndOnesInBinaryString(String str) {
		int maxDiff = 0;

		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (int j = i; j < str.length(); j++) {
				if (str.charAt(j) == '1') {
					count++;
				} else {
					count--;
				}
				if (maxDiff < Math.abs(count)) {
					maxDiff = Math.abs(count);
				}
			}

		}
		if (maxDiff == 0 || str.length() == maxDiff) {
			return -1;
		}
		return maxDiff;
	}

}
