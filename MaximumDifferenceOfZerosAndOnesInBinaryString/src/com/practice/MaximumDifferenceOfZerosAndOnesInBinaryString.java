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
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) != str.charAt(j)) {
					count++;
					continue;
				}
				if (maxDiff < count) {
					maxDiff = count;
				}
				break;
			}
		}
		if (maxDiff == 0) {
			return -1;
		}
		return maxDiff;
	}

}
