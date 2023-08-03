package com.kodenst.array.level4;

import java.util.Scanner;

public class Sollution1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER ARRAY 1 LENGTH");
		int[]arr1=new int[scan.nextInt()];
		System.out.println("ENTER "+arr1.length+" CONTENTS TO STORE IN ARRAY 1");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=scan.nextInt();
		}
		int[]arr2=new int[arr1.length];
		System.out.println("ENTER "+arr2.length+" CONTENTS TO STORE IN ARRAY 2");
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=scan.nextInt();
		}
		Q1S1 MergeElements=new Q1S1();
		int[] res=MergeElements.MergeElements(arr1,arr2);
		 
		for (int x : res) {
	            System.out.print(x + " ");
	}
		scan.close();

}
}
