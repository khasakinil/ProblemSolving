package com.ps;

public class ValidateIPAddress {

	public static void main(String[] args) {
		String ipAddress = "11..234";
		boolean isValidIp = isValidIpAddress(ipAddress);
		System.out.println("isValidIp : " + isValidIp);
	}

	private static boolean isValidIpAddress(String ipAddress) {
		boolean isValid = true;

		String[] ips = ipAddress.split("\\.");
		if (ips.length == 4) {
			for (int i = 0; i < ips.length; i++) {
				if (!(Integer.valueOf(ips[i]) >= 0 && Integer.valueOf(ips[i]) < 266)) {
					isValid = false;
					break;
				}
			}
		} else {
			isValid = false;
		}

		return isValid;
	}
}
