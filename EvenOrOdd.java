package com.xwork.taskapp;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String arg[]) {
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter an inter");
		x=sc.nextInt();
		if(x%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}

}
