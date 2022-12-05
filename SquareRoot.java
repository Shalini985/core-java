package com.xwork.taskapp;

import java.util.Scanner;

public class SquareRoot {
	
	
	public static void main(String a[]) {
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("the square root of "+n+"is:"+squreRoot(n));
		}
	public static double squreRoot(int num) {
		double t;
		double squtroot=num/2;
		
	
		do
		{
			t=squtroot;
			squtroot=(t+(num/t))/2;
		}
			while((t-squtroot)!=0);
			return squtroot;
		}
	}


