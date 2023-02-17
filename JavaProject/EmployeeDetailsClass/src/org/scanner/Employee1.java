
package org.scanner;

import java.util.Scanner;

public class Employee1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter EmpId: ");
		int empId = scanner.nextInt();
		System.out.println("Employee ID is: " + empId);
		System.out.println("Enter Employee Name:");
		String empName = scanner.next();
		System.out.println("Employee Name is: " + empName);
		System.out.println("Enter Employee email :");
		String empEmail = scanner.next();
		System.out.println("EMployee Email id is: " + empEmail);
		System.out.println("Enter Employee Gender(M/F):");
		String empGender = scanner.next();
		System.out.println("Employee Gender is: " + empGender);
		System.out.println("Enter Employee City:");
		String empCity = scanner.next();
		System.out.println("Employee city is: " + empCity);
	

	}

}
