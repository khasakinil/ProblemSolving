package com.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PalindromeString {

	/*
	 * Given a string S, check if it is palindrome or not.
	 * 
	 * Input: S = "abba" Output: 1 Explanation: S is a palindrome
	 * 
	 * Input: S = "abc" Output: 0 Explanation: S is not a palindrome
	 */

	public static void main(String args[]) {

		String str = "abc";
		checkPalindrome(str);
	}

	private static void checkPalindrome(String str) {
		int upperBound = str.length() - 1;
		int lowerBound = 0;
		boolean status = true;

		while (upperBound > lowerBound) {
			if (str.charAt(lowerBound) != str.charAt(upperBound)) {
				System.out.println(str + " is not a palindrome");
				status = false;
				break;
			}
			upperBound--;
			lowerBound++;
		}
		
		if(status) {
			System.out.println(str + " is a palindrome");
		}
	}

}
