import java.util.Scanner;

public class FactorialOfNmbr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int fact=1;
		for (int i=1;i<=N;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is "+fact);
		scan.close();
			}
	

		
	}


