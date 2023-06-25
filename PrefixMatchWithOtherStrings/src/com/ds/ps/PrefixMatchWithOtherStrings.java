package com.ds.ps;

public class PrefixMatchWithOtherStrings {
	public static void main(String args[]) {
		int n = 6;
		String arr[] = { "abba", "abbb", "abbc", "abbd", "abaa", "abca" };
		String str = "abbg";
		int k = 3;
		int prefixMatch = getPrefixMatchWithOtherStrings(arr, n, k, str);
		System.out.println("PrefixMatch : " + prefixMatch);
	}

	private static int getPrefixMatchWithOtherStrings(String[] arr, int n, int k, String str) {
		String subStr = str.substring(0, k);
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].startsWith(subStr)) {
				count++;
			}
		}
		return count;
	}
}
