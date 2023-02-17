package org.student;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student Id: ");
		int stdId = scanner.nextInt();
		System.out.println("Student ID is: " + stdId);
		System.out.println("Enter Student Name:");
		String stdName = scanner.next();
		System.out.println("Student Name is: " + stdName);
		System.out.println("Enter Student email :");
		String stdEmail = scanner.next();
		System.out.println("Student Email id is: " + stdEmail);
		System.out.println("Enter Student Phoneno :");
		int stdPhNo = scanner.nextInt();
		System.out.println("Student Phone Number is: " + stdPhNo);
		System.out.println("Enter Student Department :");
		String stdDept = scanner.next();
		System.out.println("Student Email id is: " + stdDept);
		System.out.println("Enter Student Gender(M/F):");
		String stdGender = scanner.next();
		System.out.println("Student Gender is: " + stdGender);
		System.out.println("Enter Student City:");
		String stdCity = scanner.next();
		System.out.println("Student city is: " + stdCity);
		
		
	}

}
