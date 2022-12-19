package com.xwork.collectionapp;

import java.util.Collection;
import java.util.TreeSet;

public class Coupoun {
	public static void main(String[] args) {
		String coupoun1="discount coupon lady";
		String coupoun2="ways to earn";
		String coupoun3="all plues";
		String coupoun4="lce coupan";
		String coupoun5="take them back";
		String coupoun6="coasts discount";
		String coupoun7="saver things";
		String coupoun8="redcoupan";
		String coupoun9="lifesaver";
		String coupoun10="cards N More";
		String coupoun11="Traval Coupan";
		String coupoun12="The grand Coupan";
		Collection<String> collection=new TreeSet();
		collection.add(coupoun12);
		collection.add(coupoun11);
		collection.add(coupoun10);
		collection.add(coupoun9);
		collection.add(coupoun8);
		collection.add(coupoun7);
		collection.add(coupoun6);
		collection.add(coupoun5);
		collection.add(coupoun4);
		collection.add(coupoun3);
		collection.add(coupoun2);
		collection.add(coupoun1);
		 collection .add("Sillys Coffee");
		 	System.out.println(collection.size());
			collection.clear();
			System.out.println("After clear...");
			System.out.println(collection.size());
			
		
		
	}

}
