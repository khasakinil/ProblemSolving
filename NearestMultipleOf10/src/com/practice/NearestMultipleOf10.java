package com.practice;

public class NearestMultipleOf10 {
	public static void main(String args[]) {
		String number = "15";
		String nearestNumberTo10 = getNearestNumberTo10(number);
		System.out.println("nearestNumberTo10 : " + nearestNumberTo10);
	}

	private static String getNearestNumberTo10(String number) {
		int num = Integer.parseInt(number);

		int reminder = 0;
		int nearestNum = 0;

		if (num > 0) {
			reminder = num % 10;
		}

		return nearestNum + "";
	}

}
