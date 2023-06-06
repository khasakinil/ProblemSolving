package com.practice;

public class MinNumberOfFlips {
	public static void main(String args[]) {

		String input = "0001010111";
		int minNumberOfFlips = getMinNumberOfFlips(input);
		System.out.println("minNumberOfFlips : " + minNumberOfFlips);
	}

	private static int getMinNumberOfFlips(String input) {
		int firstFlip = 0;
		int secondFlip = 0;

		char nextFlipFirst = '0';
		char nextFlipSecond = '1';

		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) != nextFlipFirst) {
				firstFlip++;
			}

			if (input.charAt(i) != nextFlipSecond) {
				secondFlip++;
			}

			if (nextFlipFirst == '0') {
				nextFlipFirst = '1';
			} else {
				nextFlipFirst = '0';
			}

			if (nextFlipSecond == '0') {
				nextFlipSecond = '1';
			} else {
				nextFlipSecond = '0';
			}
		}

		if (firstFlip < secondFlip) {
			return firstFlip;
		}

		return secondFlip;
	}
}
