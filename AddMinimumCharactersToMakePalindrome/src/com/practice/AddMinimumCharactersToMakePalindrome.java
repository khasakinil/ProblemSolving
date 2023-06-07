package com.practice;

public class AddMinimumCharactersToMakePalindrome {
	public static void main(String args[]) {

		String input = "ABCD";
		int minCharToMakePalindrome = getMinimumCharactersToMakePalindrome(input);
		System.out.println("minCharToMakePalindrome : " + minCharToMakePalindrome);
	}

	private static int getMinimumCharactersToMakePalindrome(String input) {
		if (isPalindrome(input)) {
			return 0;
		}
		return 0;
	}

	private static boolean isPalindrome(String input) {
		// TODO Auto-generated method stub
		return false;
	}
}
