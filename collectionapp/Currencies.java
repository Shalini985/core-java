package com.xwork.collectionapp;

import java.util.Collection;
import java.util.TreeSet;

public class Currencies {
	public static void main(String[] args) {
		String courrencies1="dinar";
		String courrencies2="peso";
		String courrencies3="united ";
		String courrencies4="states";
		String courrencies5="dollar";
		String courrencies6="indian";
		String courrencies7="Rupee";
		String courrencies8="pound";
		String courrencies9="iranian";
		String courrencies10="rial";
		String courrencies11="forint";
		String courrencies12="malaysian";
		String courrencies13="ringgit";
		String courrencies14="russian";
		String courrencies15="ruble";
		String courrencies16="crown";
		String courrencies17="mark";
		String courrencies18="zloty";
		String courrencies19="antigua";
		String courrencies20="austrial";
		String courrencies21="kiribati";
		String courrencies22="nauru";
		String courrencies23="tuvalu";
		String courrencies24="bahams";
		String courrencies25="barbados";
		String courrencies26="bahamian";
		 Collection<String> collection=new TreeSet();
		 collection.add(courrencies26);
		 collection.add(courrencies25);
		 collection.add(courrencies24);
		 collection.add(courrencies23);
		 collection.add(courrencies22);
		 collection.add(courrencies21);
		 collection.add(courrencies20);
		 collection.add(courrencies19);
		 collection.add(courrencies18);
		 collection.add(courrencies17);
		 collection.add(courrencies16);
		 collection.add(courrencies15);
		 collection.add(courrencies14);
		 collection.add(courrencies13);
		 collection.add(courrencies12);
		 collection.add(courrencies11);
		 collection.add(courrencies10);
		 collection.add(courrencies9);
		 collection.add(courrencies8);
		 collection.add(courrencies7);
		 collection.add(courrencies6);
		 collection.add(courrencies5);
		 collection.add(courrencies4);
		 collection.add(courrencies3);
		 collection.add(courrencies2);
		 collection.add(courrencies1);
		 
		 
		 collection .add("japanese");
		 
		
		System.out.println(collection.size());
	//	System.out.println(((Object) collection).toString());
		collection.clear();
		System.out.println("After clear...");
		System.out.println(collection.size());
		
		
		
		
	}

}
