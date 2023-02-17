package arrayex;

import java.util.Arrays;

public class ArrayCh15 {

	public static void main(String[] args) {
 int a[]= {10, 20, 30, 90, 10, 10, 40, 50, 10};
 System.out.println(Arrays.toString(a));
  int index=7;
  for(int i=0;i<a.length-1;i++) {
	 if(i==index) {
		 a[i]=90;
	 }
  }
  System.out.println(Arrays.toString(a));
	}

}
