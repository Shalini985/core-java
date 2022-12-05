package com.xwork.taskapp;

public class Vowels {
	public static void main(String args[] ) {
		int vCount=0,cCount=0;
		String str="this is really simple sentece";
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vCount++;
			}
			else if(str.charAt(i)>='a'&& str.charAt(i)<='z') {
				cCount++;
			}
		}
		System.out.println("number of vowels"+vCount);
		System.out.println("number of consontes"+vCount);
				
			}
		}
	
