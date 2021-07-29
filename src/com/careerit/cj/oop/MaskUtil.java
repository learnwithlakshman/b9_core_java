package com.careerit.cj.oop;

public class MaskUtil{
	public static String maskUuid(String uuid) {
		return "*********"+uuid.substring(uuid.length()-4);
	}
	public static String maskAccNumber(String accNumber) {
		return "*********"+accNumber.substring(accNumber.length()-4);
	}
}
