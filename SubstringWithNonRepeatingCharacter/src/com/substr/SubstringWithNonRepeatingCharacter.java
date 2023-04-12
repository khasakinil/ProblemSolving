package com.substr;

import java.util.HashSet;
import java.util.Set;

public class SubstringWithNonRepeatingCharacter {
	public static void main(String args[]) {

		String str = "abcacacbaaab";

		Set<String> uniqueStr = new HashSet<>();

		for (int i = 0; i <= str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String subStr = str.substring(i, j);

				boolean status = true;

				for (int k = 0; k < subStr.length(); k++) {
					for (int l = k + 1; l < subStr.length(); l++) {
						if (subStr.charAt(k) == subStr.charAt(l)) {
							status = false;
							break;
						}
						if (!status) {
							break;
						}
					}
				}

				if (status) {
					uniqueStr.add(subStr);
				}

			}
		}

		System.out.println(uniqueStr);
		System.out.println(uniqueStr.size());
	}
}
