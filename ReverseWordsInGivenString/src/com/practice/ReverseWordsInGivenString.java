package com.practice;

public class ReverseWordsInGivenString {
	public static void main(String[] args) {
		String input = "i.like.this.program.very.much";
		StringBuilder reverseWord = reverseWordsInString(input);
		System.out.println("Reverse String in Words : " + reverseWord);
	}

	private static StringBuilder reverseWordsInString(String input) {
		String[] splitStr = input.split("\\.");
		StringBuilder reverseWords = new StringBuilder();
		for (int i = splitStr.length - 1; i >= 0; i--) {
			reverseWords.append(splitStr[i]);
			if (i != 0) {
				reverseWords.append(".");
			}
		}
		return reverseWords;
	}
}
