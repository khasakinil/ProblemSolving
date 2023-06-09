package com.ps;

public class ReversingTheVowels {
	public static void main(String args[]) {
		String input= "geeksforgeeks";
		String reversedVowels = performReversingTheVowels(input);
		System.out.println("reversedVowels : " + reversedVowels);
	}

	private static String performReversingTheVowels(String input) {
		StringBuilder sb = new StringBuilder();
		for(int i=input.length()-1;i>=0; i--) {
			if(input.charAt(i)=='a' || input.charAt(i)=='e' ||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u') {
				sb.append(input.charAt(i));
			}
		}
		if(sb.toString().length()==0 || isPalindrome(sb.toString())) {
			return input;
		}
		return sb.toString();
	}

	private static boolean isPalindrome(String input) {
		int i=0, j=input.length()-1;
		boolean status = true;
		while(i<j) {
			if(input.charAt(i)!=input.charAt(j)) {
				status = false;
				break;
			}
			i++;
			j--;
		}
		return status;
	}
}
