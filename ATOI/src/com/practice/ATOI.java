package com.practice;

public class ATOI {

	public static void main(String[] args) {
		String str = "123";
		int convertedIntValue = getIntValue(str);
		System.out.println("convertedIntValue : " + convertedIntValue);
	}

	private static int getIntValue(String str) {

		int atoi = 0;
		boolean isNegative = false;
		for (int i = 0; i < str.length(); i++) {
			if (i == 0 && str.charAt(i) == '-') {
				isNegative = true;
				continue;
			}
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {

				atoi = (atoi * 10) + (int) (str.charAt(i) - '0');
			} else {
				return -1;
			}
		}

		if (isNegative) {
			atoi = -atoi;
		}

		return atoi;
	}
}
