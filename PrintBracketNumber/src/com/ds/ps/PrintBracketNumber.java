package com.ds.ps;

import java.util.ArrayList;
import java.util.Stack;

public class PrintBracketNumber {
	public static void main(String args[]) {
		String exp = "(aa(bdc))p(dee)";

		ArrayList<Integer> bracketNumber = getBracketNumber(exp);
		System.out.println("bracketNumber : " + bracketNumber);
	}

	private static ArrayList<Integer> getBracketNumber(String exp) {
		ArrayList<Integer> bracketNumber = new ArrayList<Integer>();

		Stack<Integer> bracketStack = new Stack<>();
		
		int nextOpen = 1;

		for (int i = 0; i < exp.length(); i++) {
			if (exp.charAt(i) == '(') {
				bracketStack.add(nextOpen++);
				bracketNumber.add(bracketStack.peek());
			} else if (exp.charAt(i) == ')') {
				bracketNumber.add(bracketStack.peek());
				bracketStack.pop();
			}
		}
		return bracketNumber;
	}
}
