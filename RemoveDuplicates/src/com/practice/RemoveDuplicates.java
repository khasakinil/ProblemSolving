package com.practice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String input = "zvvo";
		Set<Character> uniqueChars = new HashSet<>();
		for (int i = 0; i < input.length(); i++) {
			if (!uniqueChars.contains(input.charAt(i))) {
				uniqueChars.add(input.charAt(i));
				System.out.print(input.charAt(i));
			}
		}
	}
}
