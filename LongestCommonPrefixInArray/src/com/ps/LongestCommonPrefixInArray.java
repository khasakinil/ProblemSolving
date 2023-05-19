package com.ps;

public class LongestCommonPrefixInArray {

	public static void main(String[] args) {
		String arr[] = { "geeksforgeeks", "geeks", "geek", "geezer" };
		String commonPrefix = getLongestCommonPrefix(arr);
		System.out.println("LongestCommonPrefixInArray : " + commonPrefix);
	}

	private static String getLongestCommonPrefix(String[] arr) {
		String commonPrefix = "";

		String baseStr = "";

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i].length() <= arr[i + 1].length()) {
				baseStr = arr[i];
			}
		}

		for (int i = 0; i < baseStr.length(); i++) {
			for (int j = i + 1; j <= baseStr.length(); j++) {
				String subStr = baseStr.substring(i, j);
				boolean status = true;
				for (int k = 0; k < arr.length; k++) {
					if (arr[k].length() >= subStr.length()) {
						if (!arr[k].contains(subStr)) {
							status = false;
							break;
						}
					}
				}
				if (status) {
					if (commonPrefix.length() < subStr.length()) {
						commonPrefix = subStr;
					}
				}
			}
		}

		return commonPrefix;
	}
}
