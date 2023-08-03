package com.kodnest.array.level3;

import java.util.Scanner;

public class CopyArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER ARRAY LENGTH");
		int[]arr=new int[scan.nextInt()];
		System.out.println("ENTER "+arr.length+" CONTENTS TO STORE IN ARRAY");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		int[]arr1=new int[arr.length];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr1[i]=arr[i];
		}
		System.out.println("array 1 elements are...");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("array 2 elements are...");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}

}
