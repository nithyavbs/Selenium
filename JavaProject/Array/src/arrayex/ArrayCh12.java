package arrayex;

import java.util.Arrays;

public class ArrayCh12 {

	public static void main(String[] args) {
  int arr[]= { 10, 20, 30, 90, 10, 10, 40, 50, 90};
  
  System.out.println(Arrays.toString(arr));
  int index=8;
  int value=80;
  
  for(int i=arr.length-1; i>index; i--) {
	  arr[i]=arr[i-1];
  }
  arr[index]=value;
  System.out.println("After inserting : ");
  for (int i : arr) {
	System.out.println(i);
}
	}

}
