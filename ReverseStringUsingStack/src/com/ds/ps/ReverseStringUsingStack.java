package com.ds.ps;

import java.util.Stack;

public class ReverseStringUsingStack {
	public static void main(String args[]) {
		String input = "xyz";
		String reversedString = reverseStringUsingStack(input);
		System.out.println("reversedString : " + reversedString);
	}

	private static String reverseStringUsingStack(String input) {
		Stack<Character> stack = new Stack<Character>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			stack.push(input.charAt(i));
		}

		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}

		return sb.toString();
	}
}
