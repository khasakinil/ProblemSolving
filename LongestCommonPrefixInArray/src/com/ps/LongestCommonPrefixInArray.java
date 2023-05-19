package com.ps;

public class LongestCommonPrefixInArray {

	public static void main(String[] args) {
		String arr[] = { "geeksforgeeks", "geeks", "geek", "geezer" };

		String commonPrefix = getLongestCommonPrefix(arr);

		System.out.println("LongestCommonPrefixInArray : " + commonPrefix);
	}

	private static String getLongestCommonPrefix(String[] arr) {
		String commonPrefix = "";
		String baseStr = arr[0];
		for (int i = 0; i < baseStr.length(); i++) {
			for (int j = i + 1; j < baseStr.length(); j++) {

			}
		}

		return commonPrefix;
	}
}
