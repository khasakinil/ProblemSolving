package com.ps;

public class AdditionOfDigitsInNumber {
	public static void main(String args[]) {
		int number = 1234;
		int addtionOfDigits = performAdditionOfDigits(number);
		System.out.println("AddtionOfDigits : " + addtionOfDigits);
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
