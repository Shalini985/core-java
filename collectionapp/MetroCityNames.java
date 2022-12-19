package com.xwork.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCityNames {
	public static void main(String[] args) {
		
		String metro1="RajajiNagar";
		String metro2="VijayNagar";
		String metro3="Banashankari";
		String metro4="Jayanagar";
		String metro5="Chikpete";
		Collection<String> metro=new ArrayList<String>();
		metro.add(metro5);
		metro.add(metro4);
		metro.add(metro3);
		metro.add(metro2);
		metro.add(metro1);
		System.out.println(metro.size());
//		
//		for( String element:metro) {
//			System.out.println(element);
//			
//		}
		System.out.println("================");
		Iterator<String> itr=metro.iterator();
		while(itr.hasNext()) {
			String element=itr.next();
			System.out.println(element);
		}
	}

}
