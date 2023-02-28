package com.java;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Inmakes Infotech";
		String rev = " ";
		for(int i=0;i<str.length();i++) {
			rev = str.charAt(i)+rev;
		}
		System.out.println("Given String reverse is:\n" + rev);
	}

}
