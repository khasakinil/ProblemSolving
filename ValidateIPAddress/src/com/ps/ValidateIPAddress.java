package com.ps;

public class ValidateIPAddress {

	public static void main(String[] args) {
		String ipAddress = "222.111.111.1112";
		boolean isValidIp = isValidIpAddress(ipAddress);
		System.out.println("isValidIp : " + isValidIp);
	}

	private static boolean isValidIpAddress(String ipAddress) {
		boolean isValid = true;

		String[] ips = ipAddress.split("\\.");
		System.out.println(ips);
		for (int i = 0; i < ips.length; i++) {
			if (!(Integer.valueOf(ips[i]) >= 0 && Integer.valueOf(ips[i]) < 266)) {
				isValid=false;
				break;
			}
		}
		return isValid;
	}
}
