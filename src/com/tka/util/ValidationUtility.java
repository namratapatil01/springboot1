package com.tka.util;

public class ValidationUtility {

	public static boolean checkAnyTextBlankOrNull(String textToCheck) {

		if (textToCheck == null) {
			return false;
		}

		if (textToCheck != null && textToCheck.trim() == "") {
			return false;
		}
		return true;
	}

	public static boolean isNumberZero(int numToCheck) {
		if (numToCheck <= 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		isNumberZero(0);
	}

}
