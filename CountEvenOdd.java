package com.xwork.taskapp;

public class CountEvenOdd {
	public static void main(String args[]) {
		int arr[]= {2,1,43,56,87,53,11};
		int even=0;
		int odd=0;
		for(int i=0;i<10;i++)
		{
			if(arr[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
				}
		}
		System.out.println("Contents of the array:");
		for(int i=0;i<10;i++) {
			System.out.print(arr[i]+"");
			
		}
		System.out.println("\n total even no.s:"+even);
		System.out.println("\n total even no.s:"+odd);
		
	}

}
