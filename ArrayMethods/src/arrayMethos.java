import java.util.Arrays;
import java.util.Scanner;

public class arrayMethos
{
	public static void arraylength(int[] arr)
	{
		System.out.println("array length is :" +arr.length);
	}
	public static void copyOf(int[] arr)
	{
		
	System.out.println("copied array is: "+ Arrays.toString(Arrays.copyOf(arr,3)));
	}
	
	public static void copyOfRange(int[] arr)
	{
		
	System.out.println("copy of range: "+ Arrays.toString(Arrays.copyOfRange(arr, 1, 3)));
	}
	public static void binarSearch(int[] arr)
	{
		int a=4;
	System.out.println(a +" found at index " + Arrays.binarySearch(arr, a));
	}
	public static void equals(int[] arr,int[] arr1)
	{
     boolean isEqual1and2=Arrays.equals(arr, arr1);
	System.out.println("are 2 arrays are equal "+isEqual1and2);
	}
	

	
	
	


public static void main(String []args)
{
	Scanner scan=new Scanner(System.in);
	int []arr={1,2,3,4,5,6};
	int []arr1={1,5,3,2,9,6};
	
	arraylength(arr);
	copyOf(arr);
	copyOfRange(arr);
	binarSearch(arr);
	equals(arr, arr1);
	scan.close();
	
	
}
}
