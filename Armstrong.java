package com.xwork.taskapp;

import java.util.Scanner;

public class Armstrong {
	public static void main(String arg[]) {
		int num;
		int temp;
		int sum;
		int i=1;
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		num=sc.nextInt();
		sum=0;
		i=num;
		while(num>0) {
			n=num%10;
			num=num/10;
			sum=sum+(n*n*n);
			
		}
		if(sum==i) {
			System.out.print(i+"is on armstrong number");
		}
			else
			{
				System.out.print(i+"is not an armstrong number");
				
			}
		}
	}


