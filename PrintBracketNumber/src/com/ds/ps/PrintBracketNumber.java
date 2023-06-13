package com.ds.ps;

import java.util.ArrayList;

public class PrintBracketNumber {
	public static void main(String args[]) {
		String exp = "(((()(";

		ArrayList<Integer> bracketNumber = getBracketNumber(exp);
		System.out.println("bracketNumber : " + bracketNumber);
	}

	private static ArrayList<Integer> getBracketNumber(String exp) {
		ArrayList<Integer> bracketNumber = new ArrayList<Integer>();

		int nextOpen = 1;
		int nextbracket = 1;

		for (int i = 0; i < exp.length(); i++) {
			if (exp.charAt(i) == '(') {
				bracketNumber.add(nextOpen);
				nextOpen++;
				nextbracket = nextOpen;
			} else if (exp.charAt(i) == ')') {
				nextbracket--;
				bracketNumber.add(nextbracket);
			}
		}
		return bracketNumber;
	}
}
