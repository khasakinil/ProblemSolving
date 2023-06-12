package com.practice;

public class NearestMultipleOf10 {
	public static void main(String args[]) {
		String number = "1223";
		String nearestNumberTo10 = getNearestNumberTo10(number);
		System.out.println("nearestNumberTo10 : " + nearestNumberTo10);
	}

	private static String getNearestNumberTo10(String number) {

		if (number.length() > 1) {
			String tempNum = number.substring(0, number.length() - 2);

			System.out.println(tempNum);

			int lastDigitCheck = Integer.parseInt(number.substring(number.length() - 2, number.length()));

			String temp = null;
			int reminder = 0;

			if (lastDigitCheck > 0) {
				reminder = lastDigitCheck % 10;
				lastDigitCheck = lastDigitCheck / 10;
			}

			if (reminder <= 5) {
				temp = String.valueOf(lastDigitCheck * 10);
			} else {
				temp = String.valueOf(lastDigitCheck * 10 + 10);
			}

			return tempNum + temp;
		} else {
			if (Integer.parseInt(number) > 5) {
				return "10";
			} else {
				return "0";
			}
		}
	}
}
