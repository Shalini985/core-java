package com.xwork.taskapp;


	import java.util.Scanner;
	 public class Count{
	public static void main(String a[]){
	int n,count=0;
	System.out.println("Enter any number");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	while(n>0)
	{
	n=n/10;
	count++;
	}
	System.out.println("Number of digits :" +count);

	}
	}


