package arrayex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCh10 {

	public static void main(String[] args) {
		int orgArr[] = { 10, 20, 30, 90, 10, 10, 40, 50 };
	int index_pos=2;
	int new_value=50;
	
	
 System.out.println("Original Array : "+Arrays.toString(orgArr));  
	 
	for(int i=orgArr.length-1; i>index_pos; i--) {
		orgArr[i]=orgArr[i-1];
	}
	orgArr[index_pos]=new_value;
	System.out.print("After inserting : ");
	 for(int i = 0; i <orgArr.length; i++)
     {
         System.out.print(orgArr[i]+" ");
     }
	
}}
