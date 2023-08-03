package com.kodnest.arrays.level1;

import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER ARRAY LENGTH");
		int[]arr=new int[scan.nextInt()];
		System.out.println("ENTER "+arr.length+" CONTENTS TO STORE IN ARRAY");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("array contents are");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		scan.close();
	}

}
