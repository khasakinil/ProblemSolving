package com.practice;

public class MergeTwoStrings {
	public static void main(String args[]) {
		String str1 = "abc";
		String str2 = "def";
		String mergedStrings = performMergeTwoStrings(str1, str2);
		System.out.println("mergedStrings : " + mergedStrings);
	}

	private static String performMergeTwoStrings(String str1, String str2) {
		StringBuilder sb = new StringBuilder();
		int i = 0, j = 0;
		while (i < str1.length() || j < str2.length()) {
			if (i < str1.length()) {
				sb.append(str1.charAt(i));
				i++;
			}
			if (j < str2.length()) {
				sb.append(str2.charAt(j));
				j++;
			}
		}
		return sb.toString();
	}
}
