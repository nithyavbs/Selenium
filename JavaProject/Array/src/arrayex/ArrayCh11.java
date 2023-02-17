package arrayex;

import java.util.Arrays;

public class ArrayCh11 {

	public static void main(String[] args) {
		int a[]= {10, 20, 30, 90, 10, 10, 40, 50};
		int last=70;
		 int newArr[] = Arrays.copyOf(a, a.length + 1);
		 newArr[a.length] = last;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(newArr));
		
	}

}
