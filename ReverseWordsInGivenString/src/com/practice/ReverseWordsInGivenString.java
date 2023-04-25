package com.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReverseWordsInGivenString {

	/*
	 * Given a String S, reverse the string without reversing its individual words.
	 * Words are separated by dots. Input: S = i.like.this.program.very.much Output:
	 * much.very.program.this.like.i Explanation: After reversing the whole
	 * string(not individual words), the input string becomes
	 * much.very.program.this.like.i
	 */

	public static void main(String args[]) {

		String str = "i.like.this.program.very.much";

		String[] strArr = str.split("\\.");

		ReverseWordsInGivenString(strArr);
	}

	private static void ReverseWordsInGivenString(String[] strArr) {
		int i = strArr.length - 1;
		while (i >= 0) {
			System.out.print(strArr[i]);
			i--;
			if (i >= 0) {
				System.out.print(".");
			}
		}
	}

}
