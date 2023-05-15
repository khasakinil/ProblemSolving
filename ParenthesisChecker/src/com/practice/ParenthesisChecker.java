package com.practice;

import java.util.Stack;

public class ParenthesisChecker {
	public static void main(String[] args) {
		String paranthesis = "[{([])}]";

		Stack<Character> charStack = new Stack<>();
		boolean status = true;
		boolean innerChecked = false;

		for (int i = 0; i < paranthesis.length(); i++) {
			if (paranthesis.charAt(i) == '{' || paranthesis.charAt(i) == '(' || paranthesis.charAt(i) == '[') {
				charStack.push(paranthesis.charAt(i));
			} else {
				if (charStack.size() > 0) {
					Character ch = charStack.pop();
					if ((ch == '{' && paranthesis.charAt(i) == '}') || (ch == '(' && paranthesis.charAt(i) == ')')
							|| (ch == '[' && paranthesis.charAt(i) == ']')) {
						continue;
					} else {
						status = false;
						innerChecked = true;
						System.out.println("false");
						break;
					}
				} else {
					charStack.push(paranthesis.charAt(i));
				}
			}
		}
		if (status && charStack.size() == 0) {
			System.out.println("true");
		} else if(!innerChecked){
			System.out.println("false");
		}
	}
}
