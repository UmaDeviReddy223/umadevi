import java.util.Scanner;

public class AmstrongApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		int n=scan.nextInt();
		int original=n;
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		AmstrongNmbr AmstrongNmbr=new AmstrongNmbr();
		int res=AmstrongNmbr.Amstrong(original,count);
		if (res==original)
		{
			System.out.println("ENTERED NUMBER "+original+" IS AMSTRONG");
		}
		else
		{
			System.out.println("ENTERED NUMBER "+original+" IS NOT AMSTRONG");
		}
				
	}

}
