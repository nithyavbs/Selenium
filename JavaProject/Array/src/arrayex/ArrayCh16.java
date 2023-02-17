package arrayex;

import java.util.Arrays;

public class ArrayCh16 {

	public static void main(String[] args) {
  int a[]= {10, 20, 30, 90, 10, 10, 40, 50, 30};
  int newVal=100;
  for(int i=0; i<a.length;i++) {
	  if(a[i]==10) {
		  a[i]=newVal;
	  }
		  
  }
  System.out.println(Arrays.toString(a));
	}
}
