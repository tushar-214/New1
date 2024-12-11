package com.array;

public class smallestArray {
	public static void main(String[] args) {
		int array[] = { 100, 90, 30, 405, 1, 0 };
		System.out.println("original Array is ");
		for (int ar : array) {

			System.out.print("  " + ar);
		}
		int sm = array[0];
		int prev = 0;

		for (int i = 1; i < array.length; i++) {

			if (array[i] < sm) {
				prev = sm;
				sm = array[i];
			}

		}

		System.out.println(" \n smallest element of the array is ==" + sm);
		System.out.println(" \n second smallest element of the array is ==" + prev);
	}

}
