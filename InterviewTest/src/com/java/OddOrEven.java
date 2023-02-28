package com.java;

public class OddOrEven {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		System.out.println("Even Numbers:");

		for (int i = 0; i <= a.length-1; i++) {

			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}

		}
		System.out.println("odd Numbers:");

		for (int i = 0; i <= a.length-1; i++) {

			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			}

		}
	}

}
