package com.practice;

public class EditDistance {

	public static void main(String[] args) {
		String str1 = "geek";
		String str2 = "gesek";
		int editDistance = getEditDistance(str1, str2);
		System.out.println("EditDistance : " + editDistance);
	}

	private static int getEditDistance(String str1, String str2) {

		int distance = 0;

		if (str1.equals(str2)) {
			return distance;
		}

		for (int i = 0; i < str2.length(); i++) {
			if (str1.length() > i) {
				if (str2.charAt(i) != str1.charAt(i)) {
					distance++;
					str1 = str1.substring(0, i) + str2.charAt(i) + str1.substring(i);
				}
			} else {
				str1 += str2.charAt(i);
				distance++;
			}
		}
		return distance;
	}

}
