package org.string;

import java.util.Scanner;

public class LenCheck {

	public static void main(String[] args) {
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter Phone Number:");
  String phoneNo = sc.next();
  if(phoneNo.length()==10) {
	  System.out.println("Phone No is valid");
  }else
  {
	  System.out.println("Phone no is Not Valid");
  }
  
	}

}
