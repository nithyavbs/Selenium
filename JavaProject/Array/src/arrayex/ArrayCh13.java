package arrayex;

import java.util.Arrays;

public class ArrayCh13 {

	public static void main(String[] args) {
  int a[]= new int[] {10, 20, 30, 90, 10, 10, 40, 50};
  
  System.out.println(Arrays.toString(a));
  
  int index=5;
  int value=100;
  //last index of 10 replace by new value
  for(int i=a.length-1; i>index ;i--) {
	  a[i]=a[i-1];
  }
  a[index]=value;
	 for (int i : a) {
		System.out.println(i);
	}
  }
	}

