package org.student;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Student ID : ");
		int sid= sc.nextInt();
		System.out.println("Enter Student Name: ");
		String sname= sc.next();
		System.out.println("Enter Student Mark1: ");
		short sm1=sc.nextShort();
		System.out.println("Enter Student Mark2: ");
		short sm2=sc.nextShort();
		System.out.println("Enter Student Mark3: ");
		short sm3=sc.nextShort();
		System.out.println("Enter Student Mark4: ");
		short sm4=sc.nextShort();
		System.out.println("Enter Student Mark5: ");
		short sm5=sc.nextShort();
		int sum= sm1+sm2+sm3+sm4+sm5;
		int avg= sum/5;
		System.out.println("Student Total is: " + sum);
		System.out.println("Student avg mark is:" + avg);
		
		
	}

}
