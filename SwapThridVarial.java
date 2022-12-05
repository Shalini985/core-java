package com.xwork.taskapp;

import java.util.Scanner;

public class SwapThridVarial {
	public static void main(String arg[]) {
		int a;
		int b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter values of A");
		a=sc.nextInt();
     System.out.print("enter values of b");
    b=sc.nextInt();
    System.out.print("\n value of a and b before Swapping is A:"+a + " B: "+b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.print("\n value of a and b After Swapping is A:"+a  + " B: "+b);
	}
	

}
