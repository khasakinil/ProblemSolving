package com.ds.ps;

public class ExtractMaximum {
	public static void main(String args[]) {
		String exp = "100klh564abc365bg";

		int maxNumber = getMaxNumber(exp);
		System.out.println("maxNumber : " + maxNumber);
	}

	private static int getMaxNumber(String exp) {
		int max = 0;
		boolean status = false;
		int lastIndex = 0;
		for (int i = 0; i < exp.length(); i++) {
			if (exp.charAt(i) >= 48 && exp.charAt(i) <= 57) {
				status = true;
				lastIndex = 0;
				for (int j = i + 1; j < exp.length(); j++) {
					if (!(exp.charAt(j) >= 48 && exp.charAt(j) <= 57)) {
						int current = Integer.parseInt(exp.substring(i, j));
						if (current > max) {
							max = current;
						}
						i = j - 1;
						lastIndex = j;
						break;
					}
				}
				if (lastIndex == 0) {
					int current = Integer.parseInt(exp.substring(i, exp.length()));
					if (current > max) {
						max = current;
					}
				}
			}
		}

		if (status) {
			return max;
		}
		return -1;
	}
}
