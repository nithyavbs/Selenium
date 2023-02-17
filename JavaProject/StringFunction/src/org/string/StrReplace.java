package org.string;

public class StrReplace {

	public static void main(String[] args) {
		String str = "Welcome to Java Class";
		String rep = str.replace("Java", "Sql");
		System.out.println(rep);
System.out.println("****************");
		String str2= "Inmakes Kochi";
		String rep2 = str2.replace("Kochi", "Chennai");
		System.out.println(rep2);
		System.out.println("****************");	
		String str3= "Welcome to Java Class";
		String rep3 = str3.replace(" ", "#");
		System.out.println(rep3);
		System.out.println("****************");	
		String str4= "Welcome to Java Class";
		boolean emp = str4.isEmpty();
		System.out.println(emp);
		System.out.println("****************");
		String str5= "Welcome to Java Class";
		 String parts[] = str.split(" ");
		 for(String part: parts) {
	            System.out.println(part);
	        }
		 System.out.println("****************");
		String sub=str5.substring(0, 7);
		System.out.println(sub);
	}

}
