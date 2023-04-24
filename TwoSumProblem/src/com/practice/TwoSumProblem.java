package com.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoSumProblem {

	/*
	 * The two sum problem is a common interview question, and it is a variation of
	 * the subset sum problem. There is a popular dynamic programming solution for
	 * the subset sum problem, but for the two sum problem we can actually write an
	 * algorithm that runs in O(n) time. The challenge is to find all the pairs of
	 * two integers in an unsorted array that sum up to a given S.
	 * 
	 * For example, if the array is [3, 5, 2, -4, 8, 11] and the sum is 7, your
	 * program should return [[11, -4], [2, 5]] because 11 + -4 = 7 and 2 + 5 = 7.
	 */

	public static void main(String args[]) {
		int input[] = { 3, 5, 2, -4, 8, 11 };
		int s = 7;

		List<List<Integer>> result = getTwoSumResult(input, s);
		System.out.println(result);
	}

	private static List<List<Integer>> getTwoSumResult(int[] input, int s) {
		List<List<Integer>> response = new ArrayList<List<Integer>>();

		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] + input[j] == s) {
					List<Integer> sumList = new ArrayList<Integer>();
					sumList.add(input[i]);
					sumList.add(input[j]);
					response.add(sumList);
				}
			}
		}

		return response;
	}

}
