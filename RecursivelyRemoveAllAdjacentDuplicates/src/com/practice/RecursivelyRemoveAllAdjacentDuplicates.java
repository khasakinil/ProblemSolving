package com.practice;

public class RecursivelyRemoveAllAdjacentDuplicates {

	public static void main(String[] args) {
		String str = "geeksforgeek";
		String rremove = getRecursivelyRemoveAllAdjacentDuplicates(str);

		System.out.println("Output : " + rremove);
	}

	private static String getRecursivelyRemoveAllAdjacentDuplicates(String str) {

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1) || str.charAt(i) == str.charAt(i - 1)) {
				continue;
			}
			sb.append(str.charAt(i));
		}

		if (str.length() > 1 && str.charAt(str.length() - 1) != str.charAt(str.length() - 2)) {
			sb.append(str.charAt(str.length() - 1));
		}
		if (str.length() > 1 && str.charAt(0) != str.charAt(1)) {
			return str.charAt(0) + sb.toString();
		}

		return sb.toString();
	}
}
