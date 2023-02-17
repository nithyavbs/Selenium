package org.string;

import java.util.Scanner;

public class CheckString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Address:");
		String address= sc.next();

		boolean cont = address.contains("Pincode");
		System.out.println(cont);
		if (!cont) {
			System.out.println("Invalid Address");
		}
	}
}
