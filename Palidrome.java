package com.xwork.taskapp;

import java.util.Scanner;

public class Palidrome {
	public static void main(String a[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
			int temp=num;

			int rev = 0;
			while(num>0) {
				int rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}
			
			if(temp==rev) {
			System.out.println("Palindrome number");
	}
				
			else {
				
			}
			System.out.println("not palindrome");
			}

}
