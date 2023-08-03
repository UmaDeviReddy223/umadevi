package com.kodenst.array.level4;

import java.util.Scanner;

public class Sollution2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER ARRAY LENGTH");
		int[]arr=new int[scan.nextInt()];
		System.out.println("ENTER "+arr.length+" CONTENTS TO STORE IN ARRAY");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		Q2S2 findSum=new Q2S2();
		int sum=findSum.findSum(arr);
		
		System.out.println("sum of elements of array = "+sum);
		scan.close();
	}
	

}

