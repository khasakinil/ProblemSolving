package com.ps;

public class LongestPalindrome {

	public static void main(String[] args) {
		String str = "aaaabbaa";

		String longestPalindrome = getUncommonCharacters(str);

		System.out.println("LongestPalindrome : " + longestPalindrome);

	}

	private static String getUncommonCharacters(String str) {
		String longestPalindrome = "";

		for (int i = 0; i <= str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String currentStr = str.substring(i, j);
				if (isPalindrome(currentStr)) {
					if (currentStr.length() > longestPalindrome.length()) {
						longestPalindrome = currentStr;
					}
				}
			}
		}

		return longestPalindrome;
	}

	private static boolean isPalindrome(String currentStr) {

		int i = 0, j = currentStr.length() - 1;
		boolean status = true;
		while (i < j) {
			if (currentStr.charAt(i) != currentStr.charAt(j)) {
				status = false;
				break;
			}
			i++;
			j--;
		}
		return status;
	}

}
