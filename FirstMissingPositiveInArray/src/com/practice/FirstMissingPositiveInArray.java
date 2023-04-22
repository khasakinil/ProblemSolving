package com.practice;

import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositiveInArray {
	public static void main(String args[]) {
		int input[] = { 4, 6, 5, 3, 8 };

		Set<Integer> integerSet = new HashSet<>();

		for (int i = 0; i < input.length; i++) {
			integerSet.add(input[i]);
		}

		for (int i = 1; i <= input.length; i++) {
			if (!integerSet.contains(i)) {
				System.out.println(i);
				break;
			}
		}

	}

}
