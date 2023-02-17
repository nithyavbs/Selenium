package org.string;

public class HashCode {

	public static void main(String[] args) {
		String str1 = "Nisha";
		String str2 = "nisha";
		String str3 = "Nisha";
		boolean cmp = str1.equals(str2);

		System.out.println(cmp);
		
		System.out.println("String 1:" + System.identityHashCode(str1));
		System.out.println("String 2:" + System.identityHashCode(str3));

		String str4 = "INMAKES INFOTECH";
		String lower = str4.toLowerCase();
		System.out.println("Lower case of string:" + lower);
	}

}
