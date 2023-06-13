package com.ds.ps;

public class PrintBracketNumber {
	public static void main(String args[]) {
		String exp = "(((()(";

		String bracketNumber = getBracketNumber(exp);
		System.out.println("bracketNumber : " + bracketNumber);
	}

	private static String getBracketNumber(String exp) {
		StringBuilder sb = new StringBuilder();
		
		int nextOpen = 1;
		int nextbracket = 1;
		
		for(int i=0; i<exp.length(); i++) {
			if(exp.charAt(i) == '(') {
				sb.append(nextOpen + " ");
				nextOpen++;
				nextbracket=nextOpen;
			}else if(exp.charAt(i) == ')') {
				nextbracket--;
				sb.append(nextbracket + " ");
			}
		}
		return sb.toString();
	}
}
