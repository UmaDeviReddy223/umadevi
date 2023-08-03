package com.kodenst.array.level4;
import java.util.Scanner;
public class ReplaceElementsInArrayApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER ARRAY 1 LENGTH");
		int[]arr1=new int[scan.nextInt()];
		System.out.println("ENTER "+arr1.length+" CONTENTS TO STORE IN ARRAY 1");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=scan.nextInt();
		}	
		ReplaceElInArray ReplaceElInArray=new ReplaceElInArray();
		ReplaceElInArray.RepElements(arr1);
		scan.close();
	}
}
