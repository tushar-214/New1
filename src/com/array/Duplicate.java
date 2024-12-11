package com.array;

public class Duplicate {
	public static void main(String[] args) {
		int[] array= {10,20,30,40,40,50,10};
		
		System.out.println("print the Duplicate Number :: ");
		
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
			if(array[i]==array[j])
			{
				System.out.println("duplicate element ="+array[i] + "at position== "+i );
				
			}
				
		}
	}

}
}

