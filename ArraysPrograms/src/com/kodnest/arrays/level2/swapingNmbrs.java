package com.kodnest.arrays.level2;

import java.util.Scanner;

public class swapingNmbrs {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER 2 NUMBERS TO SWAP");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("BEFORE SWAPING "+a+ " "+b);
		int c;
		c=a;
		a=b;
		b=c;
		System.out.print("AFTER SWAPING "+a+ " "+b);

	}

}
