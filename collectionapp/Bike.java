package com.xwork.collectionapp;

import java.util.Collection;
import java.util.TreeSet;

public class Bike {

	public static void main(String[] args) {
		String bikeName1="Tvs";
		String bikeName2="hero";
		String bikeName3="Moto";
		String bikeName4="Honda";
		String bikeName5="KTM";
		String bikeName6="BGauss";
		String bikeName7="Bajaj";
		String bikeName8="Rayoal";
		String bikeName9="Yamaha";
		String bikeName10="Suzuki";
		String bikeName11="Jawa";
		String bikeName12="Mahendra";
		String bikeName13="Mt 15";
		String bikeName14="Raven";
		String bikeName15="Nova";
		String bikeName16="Firefly";
		String bikeName17="Patriot";
		String bikeName18="grey iron";
		Collection<String> collection=new TreeSet();
		collection.add(bikeName18);
		collection.add(bikeName17);
		collection.add(bikeName16);
		collection.add(bikeName15);
		collection.add(bikeName14);
		collection.add(bikeName13);
		collection.add(bikeName12);
		collection.add(bikeName11);
		collection.add(bikeName10);
		collection.add(bikeName9);
		collection.add(bikeName8);
		collection.add(bikeName7);
		collection.add(bikeName6);
		collection.add(bikeName5);
		collection.add(bikeName4);
		collection.add(bikeName3);
		collection.add(bikeName2);
		collection.add(bikeName1);
		
		collection.add("indian Motocycle");
		System.out.println(collection.size());
		System.out.println("After clear......");
		collection.clear();
		System.out.println(collection.size());
		
		
		
		
		
		
		

	}

}
