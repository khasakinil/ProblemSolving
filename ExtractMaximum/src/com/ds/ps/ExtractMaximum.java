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
		for (int i = 0; i < exp.length(); i++) {
			if (exp.charAt(i) >= (int) ('0') && exp.charAt(i) <= (int) ('9')) {
				status = true;
				for (int j = i + 1; j < exp.length(); j++) {
					if (!(exp.charAt(j) >= (int) ('0') && exp.charAt(j) <= (int) ('9'))) {
						int current = Integer.parseInt(exp.substring(i, j));
						if (current > max) {
							max = current;
						}
						i = j - 1;
						break;
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
