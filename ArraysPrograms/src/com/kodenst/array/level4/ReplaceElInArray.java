package com.kodenst.array.level4;

public class ReplaceElInArray {
	public void RepElements(int []arr1)
	{
		for(int i=0;i<=arr1.length-1;i++)
		{
			if(arr1[i]<0)
			{
				arr1[i]=0;
			}
			else
			{
				System.out.print(arr1[i]+" ");
			}
		}	
}
}
