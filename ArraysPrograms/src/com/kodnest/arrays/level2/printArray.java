package com.kodnest.arrays.level2;

public class printArray {

	public static void PrintArray(int[] arr) {
		{
			for(int x:arr)
		      { 
		    	  System.out.print(x+" ");
		      } 
			System.out.println();
			for (int x=arr.length-1;x>=0;x--)
			{ 
				 System.out.print(x+" ");
			}
		}
	}

}
