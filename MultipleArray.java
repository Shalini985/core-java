package com.xwork.taskapp;

public class MultipleArray {
	static int countMultiples(int n) {
		int res=0;
		for(int i=1;i<=n;i++)
			if(i%3==0||i%7==0)
				res++;
		return res;
	}
	public static void main(String args) {
		System.out.print("Count=");
		System.out.println(countMultiples(25));
		
	}

}
