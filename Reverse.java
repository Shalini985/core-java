package com.xwork.taskapp;

public class Reverse {
	
		 public static void main(String a[]){
		  String string="Dream big";
		  String reverseStr="";
		  for(int i=string.length()-1;i>=0;i--){
		   reverseStr=reverseStr+string.charAt(i);
		   }
		   System.out.println("Original string:" +string);
		   System.out.println("Reverse of given string:"+reverseStr);
		 
		 }



		} 



