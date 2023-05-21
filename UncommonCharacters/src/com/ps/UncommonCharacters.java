package com.ps;

import java.util.Set;
import java.util.TreeSet;

public class UncommonCharacters {

	public static void main(String[] args) {
		String str1 = "geeks";
		String str2 = "geeks";

		String uncommonCharacters = getUncommonCharacters(str1, str2);

		System.out.println("uncommonCharacters : " + uncommonCharacters);

	}

	private static String getUncommonCharacters(String str1, String str2) {
		Set<Character> charList = new TreeSet<>();
		String uncommonStr = "";
		for (int i = 0; i < str1.length(); i++) {
			if (!str2.contains(str1.charAt(i) + "")) {
				charList.add(str1.charAt(i));
			}
		}

		for (int i = 0; i < str2.length(); i++) {
			if (!str1.contains(str2.charAt(i) + "")) {
				charList.add(str2.charAt(i));
			}
		}

		for (Character c : charList) {
			uncommonStr += c;
		}

		if (uncommonStr.length() > 0) {
			return uncommonStr;
		} else {
			return "-1";
		}
	}

}
