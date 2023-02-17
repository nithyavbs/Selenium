package org.string;

public class StringIndex {

	public static void main(String[] args) {
		String str1 = "InmakesInfotech";
		int findLast = str1.lastIndexOf("o");
		System.out.println("Last Index of O:" + findLast);
	
		String str2 = "SeleniumAutomationtool";
		int findFirst = str2.indexOf('o');
		System.out.println("First Index of O:" + findFirst);
		
		String str3 = "PenealSamuel";
		int findPos= str3.indexOf("n");
		System.out.println("FInd index of n: " + findPos);
		
		String str4 = "j a v a p r o g r a m"; 
		int findLast1= str4.lastIndexOf(" ");
		System.out.println("the last index of ‘emptyspace’:" + findLast1);
		
		String str5= "9688815564";
	    int findNo= str5.lastIndexOf('1');
	    System.out.println("Find the 1 position:" + findNo);
	}
}