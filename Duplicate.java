package com.xwork.taskapp;

import java.util.Scanner;

public class Duplicate {
	public static void main(String a[]) {
		int arr[]=new int[50];
		int n;
		int i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:");
		n=sc.nextInt();
		System.out.println("enter "+n+"arry element:");
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
         System.out.println("content of the array-");
         for(i=0;i<n;i++) {
        	 System.out.print(arr[i]+"");
         }
	}
	
	

}
