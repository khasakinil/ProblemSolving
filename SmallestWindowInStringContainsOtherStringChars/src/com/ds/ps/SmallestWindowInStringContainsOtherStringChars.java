package com.ds.ps;

import java.util.HashSet;
import java.util.Set;

public class SmallestWindowInStringContainsOtherStringChars {
	public static void main(String args[]) {
		String OriginalStr = "geeksforgeeks";
		String windowStr = "ork";
		String output = getSmallestWindowInStringContainsOtherStringChars(OriginalStr, windowStr);
		System.out.println("SmallestWindowInStringContainsOtherStringChars : " + output);
	}

	private static String getSmallestWindowInStringContainsOtherStringChars(String originalStr, String windowStr) {
		Set<Character> windowSet = getWindowSet(windowStr);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < originalStr.length(); i++) {
			for (int j = i + windowStr.length(); j <= originalStr.length(); j++) {
				String temp = originalStr.substring(i, j);
				if (temp.length() >= windowSet.size() && isWindowContainsOtherStr(temp, windowSet)) {
					if (sb.length() == 0) {
						sb.delete(0, sb.length());
						sb.append(temp);
					}
					if (sb.length() > temp.length()) {
						sb.delete(0, sb.length());
						sb.append(temp);
						break;
					}
				}
			}
		}
		return sb.toString();
	}

	private static Set<Character> getWindowSet(String windowStr) {
		Set<Character> windowMap = new HashSet<>();
		for (int i = 0; i < windowStr.length(); i++) {
			windowMap.add(windowStr.charAt(i));
		}
		return windowMap;
	}

	private static boolean isWindowContainsOtherStr(String temp, Set<Character> windowSet) {
		Set<Character> tempWindowSet = new HashSet<>();
		for (int i = 0; i < temp.length(); i++) {
			if (windowSet.contains(temp.charAt(i))) {
				tempWindowSet.add(temp.charAt(i));
			}
		}
		if (windowSet.size() == tempWindowSet.size()) {
			return true;
		}
		return false;
	}
}
