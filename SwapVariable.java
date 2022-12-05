package com.xwork.taskapp;

import java.util.Scanner;

public class SwapVariable {
	public static void main(String args[]) {
		int x,y,t;
		Scanner sc =new Scanner(System.in);
		System.out.print("enter the values x and y");
		
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Before Swapping number: "+ x +" " +y);
		t=x;
		x=y;
		y=t;
		System.out.println("after Swapping number: "+ x +" " +y);
		System.out.println();
		
	}

}
