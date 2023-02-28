package com.java;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID : ");
		int studId= sc.nextInt();
		System.out.println("Enter Student Name: ");
		String stdName= sc.next();
		System.out.println("Enter Student Mark1: ");
		short studMark1=sc.nextShort();
		System.out.println("Enter Student Mark2: ");
		short studMark2=sc.nextShort();
		System.out.println("Enter Student Mark3: ");
		short studMark3=sc.nextShort();
		System.out.println("Enter Student Mark4: ");
		short studMark4=sc.nextShort();
		System.out.println("Enter Student Mark5: ");
		short studMark5=sc.nextShort();
		int total=studMark1+studMark2+studMark3+studMark4+studMark5;
		int avg= total/5;
		System.out.println("Student Total is: " + total);
		System.out.println("Student avg mark is:" + avg);
		
		
		
	}

}
