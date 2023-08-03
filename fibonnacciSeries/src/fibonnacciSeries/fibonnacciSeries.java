package fibonnacciSeries;

import java.util.Scanner;

public class fibonnacciSeries {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER A NUMBER TO FIND FIBONNACCI SERIES");
		int n=scan.nextInt();
		int fib1=0;
		int fib2=1;
		if (n==1)
		{
			System.out.println(fib1);
		}
		else if(n==2)
		{
			System.out.println(fib2 +" "+ fib1);
		}
		else 
		{
			System.out.print(fib1+" "+fib2);
			for (int i=3;i<=n;i++)
			{
				int NextNo=fib1+fib2;
				System.out.print(" "+NextNo+" ");
				fib1=fib2;
				fib2=NextNo;
			}
		}

	}

}
