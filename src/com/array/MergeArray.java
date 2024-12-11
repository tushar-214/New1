package com.array;

public class MergeArray {
	public static void main(String[] args) {
		int arr1[] = { 10, 20, 30, 40, 50 };
		int arr2[] = { 100, 200, 300, 400, 500 };
		int l1 = arr1.length;
		int l2 = arr2.length;
		int l3=l1+1;
		int arr3[]=new int[l1+l2];
		
		System.out.println("length of array 3rd ="+arr3.length);
		for(int i=0;i<arr1.length;i++)
		{
			arr3[i]=arr1[i];
		}
		for(int j=0;j<arr2.length;j++)
		{
			arr3[(l3-1)+j]=arr2[j];
		}
		
		for (int res : arr3) {
			System.out.print("   "+res);
		}

	}
}
