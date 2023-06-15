package com.ds.ps;

public class ConvertToRoman {
	public static void main(String args[]) {
		int input = 5;

		String intToRoman = getIntToRoman(input);
		System.out.println("intToRoman : " + intToRoman);
	}

	private static String getIntToRoman(int inputNum) {

		int[] romanValues = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] romanLetters = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<romanValues.length; i++) {
			while(inputNum>=romanValues[i]) {
				sb.append(romanLetters[i]);
				inputNum -= romanValues[i];
			}
		}
		
		return sb.toString();
	}
}
