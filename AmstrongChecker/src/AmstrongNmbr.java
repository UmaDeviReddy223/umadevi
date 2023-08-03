import java.lang.Math;
public class AmstrongNmbr {
    public int Amstrong(int n,int count)
    {
    	int sum=0;
    	while(n!=0)
    	{
    	int rem=n%10; 
        int res= (int) Math.pow(rem,3);
        sum=sum+res;
        n=n/10;
    	}
    	return sum;
    }
}
