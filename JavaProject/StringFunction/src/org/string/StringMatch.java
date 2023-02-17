package org.string;

import java.util.Scanner;

public class StringMatch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Phone Number:");
		String phNo = sc.next();
		String no= "\\d{10}";
		boolean matches = phNo.matches(no);
		if(matches==true) {
			System.out.println("Correct number format");
		}
		else {
			System.out.println(" Wrong Format");
		}
	}

}
