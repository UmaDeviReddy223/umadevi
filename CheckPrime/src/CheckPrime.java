import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("enter the range to print prime numbers");
	    int n=scan.nextInt();
	    int count =0;
	    for (int i=3;i<=n;i++)
	    {
	    	int res=checkPrime(i);
	    	if(res!=0)
	    	{
	    		System.out.println(res);
	    		count++;
	    	}
	    }
	    System.out.println("no of prime nmbrs is="+count);
	}
	    public static int checkPrime(int n)
	    {
	    	for (int i=2;i<n;i++)
	    	{
	    		if (n%2==0)
	    		{
	    			return 0;
	    		}	
	    	}
	    	return n;
	    }
}

