package com.ps;

public class AdditionOfDigitsInNumber {
	public static void main(String args[]) {
		int number = 1234;
		int addtionOfDigits = performAdditionOfDigits(number);
		System.out.println("Addtion Of All Digits : " + addtionOfDigits);

		int additionOfEvenDigits = getAdditionOfEvenDigits(number);
		System.out.println("Addition Of Even Digits : " + additionOfEvenDigits);
	}

	private static int getAdditionOfEvenDigits(int number) {
		int digitAddition = 0;
		int temp = 0;
		while (number > 0) {
			temp = number % 10;
			if (temp % 2 == 0) {
				digitAddition += temp;
			}
			number /= 10;
		}
		return digitAddition;
	}

	private static int performAdditionOfDigits(int number) {
		int digitAddition = 0;
		int temp = 0;
		while (number > 0) {
			temp = number % 10;
			digitAddition += temp;
			number /= 10;
		}
		return digitAddition;
	}
}
