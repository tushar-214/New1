package com.array;

public class ReverseArrayDemo {
	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50 };
		System.out.println("before reverse array print ::");
		for (int a : array) {
			System.out.print("  " + a);
		}
		int temp = 0;
		for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {

			temp = array[i];
			array[i] = array[j];
			array[j] = temp;

		}

		System.out.println("\n  reverse array print ::");
		for (int rev : array) {
			System.out.print("  " + rev);

		}

	}
}