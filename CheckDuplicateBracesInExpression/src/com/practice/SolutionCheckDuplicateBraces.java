package com.practice;

import java.util.Stack;

public class SolutionCheckDuplicateBraces {
	public static void main(String args[]) {
		String str1 = "(((a-b)+(m+n))+c)";
		String str2 = "(((a-b))+c)";
		checkDuplicateBracesInExpression(str1);
		checkDuplicateBracesInExpression(str2);
	}

	private static void checkDuplicateBracesInExpression(String str) {
		Stack<Character> charStack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ')') {
				charStack.push(str.charAt(i));
			} else {
				int count = 0;
				while (true) {
					Character currentChar = charStack.pop();
					count++;

					if (currentChar == '(' && count == 1) {
						System.out.println("true");
						System.exit(1);
					}

					if (currentChar == '(') {
						break;
					}
				}
			}
		}
		System.out.println("false");
	}
}
