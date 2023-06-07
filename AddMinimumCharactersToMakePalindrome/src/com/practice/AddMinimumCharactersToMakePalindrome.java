package com.practice;

public class AddMinimumCharactersToMakePalindrome {
	public static void main(String args[]) {
		String input = "ABA";
		int minCharToMakePalindrome = getMinimumCharactersToMakePalindrome(input);
		System.out.println("minCharToMakePalindrome : " + minCharToMakePalindrome);
	}

	private static int getMinimumCharactersToMakePalindrome(String input) {

		int minChars = 0;
		int palindromeTillLength = 0;
//		if (isPalindrome(input)) {
//			return 0;
//		}

//		for (int i = 1; i < input.length(); i++) {
//			if (isPalindrome(input.substring(0, i))) {
//				palindromeTillLength = i;
//			}
//		}
		
		for (int i = input.length(); i >= 0; i--) {
			if (isPalindrome(input.substring(0, i))) {
				palindromeTillLength = i;
				break;
			}
		}
		
		minChars = input.length() - palindromeTillLength;
		return minChars;
	}

	private static boolean isPalindrome(String input) {
		boolean isPandrome = true;
		int i = 0, j = input.length() - 1;
		while (i < j) {
			if (input.charAt(i) != input.charAt(j)) {
				isPandrome = false;
				break;
			}
			i++;
			j--;
		}
		return isPandrome;
	}
}
