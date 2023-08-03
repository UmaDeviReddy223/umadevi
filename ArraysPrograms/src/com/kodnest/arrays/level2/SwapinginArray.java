package com.kodnest.arrays.level2;

import java.util.Scanner;

public class SwapinginArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER ARRAY LENGTH");
		int[]arr=new int[scan.nextInt()];
		System.out.println("ENTER "+arr.length+" CONTENTS TO STORE IN ARRAY");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int x:arr)
	      { 
	    	  System.out.print(x+" ");
	    	  }
		System.out.println();
		System.out.println("ENTER 2 INDEXES OF ARRAY TO SWAP");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c;
		c=arr[a];
		arr[a]=arr[b];
		arr[a]=c;
		for(int x:arr)
	      { 
	    	  System.out.print(x+" ");
	    	  }   	  
	}

}
