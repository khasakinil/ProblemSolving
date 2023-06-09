package com.practice;

public class ReverseTheEquation {
	public static void main(String args[]) {
		String equation = "20-3";
		String reversedEquation = getReversedEquation(equation);
		System.out.println("reversedEquation : " + reversedEquation);
	}

	private static String getReversedEquation(String equation) {
		StringBuilder sb = new StringBuilder();
		int lastIndex = equation.length();
		for(int i=equation.length()-1; i>=0; i--) {
			if(equation.charAt(i)=='+' ||equation.charAt(i)=='-'||equation.charAt(i)=='*'||equation.charAt(i)=='/') {
				sb.append(equation.substring(i+1,lastIndex)).append(equation.charAt(i));
				lastIndex = i;
			}
		}
		
		sb.append(equation.substring(0, lastIndex));
		
		return sb.toString();
	}

}
