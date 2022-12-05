package com.xwork.taskapp;

import java.util.Scanner;

public class Factroial{
		public static void main(String arg[]){

		int n,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		for(int i=1;i<=n;i++){
		fact=fact*i;
		}
		System.out.println("Factrioal of "+n+" is"+fact);

		}

		}


