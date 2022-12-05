package com.xwork.taskapp;

import java.util.Scanner;

public class LoapYear {
public static void main(String args[]) {
	int year;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the year:");
	year=sc.nextInt();
	if(year%400==0)
	{
		System.out.print(year+"is a leap year");
	}
	else if (year % 100==0) {
		System.out.print(year+"is not a leap year");
	}
	else if (year%4==0)
	{
		System.out.println(year+"is a leap year");
	}
	else
	{
		System.out.print(year+"is not a leap year");
		
	}
}
}
