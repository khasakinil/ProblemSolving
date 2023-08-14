package com.practice;

public class MultiplyTwoStrings {
	public static void main(String args[]) {
		String str1 = "0033";
		String str2 = "-00002";
		String strMultiply = getStringsMultiply(str1, str2);
		System.out.println("Multiple of two Strings : " + strMultiply);
	}

	private static String getStringsMultiply(String str1, String str2) {

		boolean isStr1Neg = false;
		boolean isStr2Neg = false;

		if (str1.startsWith("-")) {
			str1 = str1.substring(1, str1.length());
			isStr1Neg = true;
		}

		if (str2.startsWith("-")) {
			str2 = str2.substring(1, str2.length());
			isStr2Neg = true;
		}

		char[] num1 = str1.toCharArray();
		char[] num2 = str2.toCharArray();

		int result = 0;

		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num2.length; j++) {
				result += (num1[i] - '0') * (num2[j] - '0')
						* (int) Math.pow(10, num1.length + num2.length - (i + j + 2));
			}
		}

		if (isStr1Neg && isStr2Neg) {
			return result + "";
		} else if ((isStr1Neg && !isStr2Neg) || (!isStr1Neg && isStr2Neg)) {
			return "-" + result + "";
		}

		return result + "";
	}
}
