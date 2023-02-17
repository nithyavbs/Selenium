package org.string;

import java.util.Scanner;

public class CheckChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email id:");
		String emailId = sc.next();

		boolean valid = emailId.contains("@");
		if (valid) {
			System.out.println("valid email id");
		} else
			System.out.println("Not a valid email id");
	}
}
