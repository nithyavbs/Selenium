package arrayex;

import java.util.Arrays;

public class ArrayCh14 {

	public static void main(String[] args) {
		int arr[] = new int[] { 100, 200, 300, 400, 500, 600, 700 };
		
		System.out.println("before" + Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==300) {
				arr[i]=350;
			}
			//System.out.println(arr[i]);
		}
		System.out.println("After:" + Arrays.toString(arr));
	}

}
