package com.practice;

public class SumOfAllSubstringsOfNumber {
	public static void main(String[] args) {
		String input = "421";
		long sumOfAllNumbers = getSumOfAllNumbers(input);
		System.out.println("sumOfAllNumbers : " + sumOfAllNumbers);
	}

	private static long getSumOfAllNumbers(String input) {

		long sum = 0;
		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 1; j <= input.length(); j++) {
				sum += Long.parseLong(input.substring(i, j));
			}
		}
		return sum;
	}
}
