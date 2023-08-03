package com.kodenst.array.level4;

public class Q2S2 {
	int findSum(int arr[]) {
	int sum=0;
	for(int i=0;i<=arr.length-1;i++)
	{
		sum=arr[i]+sum;
	}
	return sum;
}
}
