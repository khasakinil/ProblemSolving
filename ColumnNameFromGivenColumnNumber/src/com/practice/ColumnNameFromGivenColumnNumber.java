package com.practice;

public class ColumnNameFromGivenColumnNumber {
	public static void main(String args[]) {
		long n = 28;
		String colName = getColName(n);
		System.out.println("Column name for : " + n + " is :" + colName);
	}

	private static String getColName(long num) {
		StringBuilder colName = new StringBuilder();

		while (num > 0) {

			int rem = (int) num % 26;

			if (rem == 0) {
				colName.append('Z');
				num = (num / 26) - 1;
			} else {
				colName.append((char) ((rem - 1) + 'A'));
				num = (num / 26);
			}
		}
		return colName.reverse().toString();
	}
}
