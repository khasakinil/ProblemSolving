package com.practice;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
	public static void main(String args[]) {
		String str1 = "aab";
		String str2 = "xty";
		int isIsomorphic = IsomorphicString(str1, str2);
		System.out.println("IsomorphicStrings : " + isIsomorphic);
	}

	private static int IsomorphicString(String str1, String str2) {

		Map<Character, Character> isoMapStr1 = new HashMap<>();
		Map<Character, Character> isoMapStr2 = new HashMap<>();
		if (str1.length() != str2.length()) {
			return 0;
		} else {
			for (int i = 0; i < str1.length(); i++) {
				if (isoMapStr1.get(str1.charAt(i)) == null) {
					isoMapStr1.put(str1.charAt(i), str2.charAt(i));
				}

				if (isoMapStr2.get(str2.charAt(i)) == null) {
					isoMapStr2.put(str2.charAt(i), str1.charAt(i));
				}

				if (str2.charAt(i) != isoMapStr1.get(str1.charAt(i))
						|| str1.charAt(i) != isoMapStr2.get(str2.charAt(i))) {
					return 0;
				}
			}
			return 1;
		}
	}
}
