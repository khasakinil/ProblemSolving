package com.practice;

public class AddMinimumCharactersToMakePalindrome {
	public static void main(String args[]) {
		String input = "A";
		int minCharToMakePalindrome = getMinimumCharactersToMakePalindrome(input);
		System.out.println("minCharToMakePalindrome : " + minCharToMakePalindrome);
	}

	private static int getMinimumCharactersToMakePalindrome(String input) {
		int minChar = 0, i = 0, j = input.length() - 1;
		while (i < j) {
			if (input.charAt(i) == input.charAt(j)) {
				i++;
				j--;
			} else {
				minChar++;
				i = 0;
				j = input.length() - minChar - 1;
			}
		}
		return minChar;
	}
}
