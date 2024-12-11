package com.array;

public class SortArray {

	public void arraySort(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {

				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;

				}
			}

		}
		System.out.println("\n Print the array after sorting ::");
		for (int i : array) {
			System.out.print("  " + i);
		}

	}

	public static void main(String[] args) {
		int[] array = { 10, 5, 3, 1, 15 };
		System.out.println("Print the array before sorting ::");
		for (int i : array) {
			System.out.print("  " + i);
		}

		SortArray ar = new SortArray();
		ar.arraySort(array);

	}
}
