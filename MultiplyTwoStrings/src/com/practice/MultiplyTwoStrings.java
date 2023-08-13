package com.practice;

public class MultiplyTwoStrings {
	public static void main(String args[]) {
		String str1 = "0033";
		String str2 = "2";
		String strMultiply = getStringsMultiply(str1, str2);
		System.out.println("Multiple of two Strings : " + strMultiply);
	}

	private static String getStringsMultiply(String str1, String str2) {

		char[] num1 = str1.toCharArray();
		char[] num2 = str2.toCharArray();

		int result = 0;

		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num2.length; j++) {
				result += (num1[i] - '0') * (num2[j] - '0')
						* (int) Math.pow(10, num1.length + num2.length - (i + j + 2));
			}
		}
		return result + "";
	}
}
