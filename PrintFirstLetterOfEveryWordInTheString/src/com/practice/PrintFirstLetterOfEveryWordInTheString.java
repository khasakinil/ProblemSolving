package com.practice;

public class PrintFirstLetterOfEveryWordInTheString {
	public static void main(String args[]) {

		String input = "geeks for geeks";
		String firstLetterOfStrings = getFirstLetterOfEveryWordInTheString(input);
		System.out.println("firstLetterOfStrings : " + firstLetterOfStrings);
	}

	private static String getFirstLetterOfEveryWordInTheString(String input) {
		String[] arrStr = input.split("\\ ");

		StringBuilder sb = new StringBuilder();

		for (String str : arrStr) {
			sb.append(str.charAt(0));
		}
		return sb.toString();
	}

}
