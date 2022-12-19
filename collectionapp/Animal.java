package com.xwork.collectionapp;

import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Animal {
	public static void main(String[] args) {
		String animalName1="dog";
		String animalName2="cat";
		String animalName3="rat";
		String animalName4="lion";
		String animalName5="tigar";
		String animalName6="zebra";
		String animalName7="rabit";
		String animalName8="monky";
		String animalName9="cow";
		String animalName10="horse";
		Collection<String> ani=new ArrayList<String>();
		ani.add(animalName10);
		ani.add(animalName9);
		ani.add(animalName8);
		ani.add(animalName7);
		ani.add(animalName6);
		ani.add(animalName5);
		ani.add(animalName4);
		ani.add(animalName3);
		ani.add(animalName2);
		ani.add(animalName1);
		ani.add("Elephant");
		System.out.println(ani.size());
	//	System.out.println(ani);
		System.out.println("accessing all the elements");
		
//		for(String element:ani) {
//			System.out.println(element);
//			
//		}
//		
		Iterator<String> itr=ani.iterator();
		while(itr.hasNext()) {
			String element=itr.next();
			System.out.println(element);
		}
		
		
		
		
	}
}
