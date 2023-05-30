package com.practice;

public class RemoveSpaces {
	public static void main(String args[]) {
		String str = "geeks  for geeks";
		String finalString = removeSpacesFromString(str);
		System.out.println("String after removing spaces : " + finalString);
	}

	private static String removeSpacesFromString(String str) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				sb.append(str.charAt(i));
			}
		}

		return sb.toString();
	}
}
