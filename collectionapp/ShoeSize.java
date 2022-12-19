package com.xwork.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoeSize {
	public static void main(String[] args) {
		int no1=21;
		int no2=22;
		int no3=23;
		int no4=24;
		int no5=25;
		int no6=26;
		int no7=27;
		int no8=28;
		int no9=29;
		int no10=30;
		int no11=31;
		int no12=32;
		int no13=33;
		int no14=34;
		int no15=35;
		Collection<Integer> shoe=new ArrayList<Integer>();
		shoe.add(21);
		shoe.add(22);
		shoe.add(23);
		shoe.add(24);
		shoe.add(25);
		shoe.add(26);
		shoe.add(27);
		shoe.add(28);
		shoe.add(29);
		shoe.add(30);
		shoe.add(31);
		shoe.add(32);
		shoe.add(33);
		shoe.add(34);
		shoe.add(35);
		System.out.println(shoe.size());
		
		System.out.println("Accesing integer===========");
//		for(Integer element:shoe) {
//			System.out.println(element);
//				
//			}
		Iterator<Integer> itr=shoe.iterator();
		while(itr.hasNext()) {
			Integer element=itr.next();
			System.out.println(element);
			
		}
		
		
		
		
		
			
		}
	}


