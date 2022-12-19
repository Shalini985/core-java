package com.xwork.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class Sweet {
public static void main(String[] args) {

		 String sweetName1="payasa";
		 String sweetName2="trudy";
		 String sweetName3="holly";
		 String sweetName4="thea";
		 String sweetName5="bo";
		 String sweetName6="clara";
		 String sweetName7="ziva";
		 String sweetName8="eve";
		 String sweetName9="amy";
		 String sweetName10="june";
		 String sweetName11="draew";
		 String sweetName12="joy";
		 String sweetName13="vera";
		 Collection<String> collection=new TreeSet();
		 List<String> list =new ArrayList();
			
			collection.add(sweetName13);
			collection.add(sweetName1);
			collection.add(sweetName2);
			collection.add(sweetName3);
			collection.add(sweetName4);
			collection.add(sweetName5);
			collection.add(sweetName6);
			collection.add(sweetName7);
			collection.add(sweetName8);
			collection.add(sweetName9);
			collection.add(sweetName10);
			collection.add(sweetName11);
			collection.add(sweetName12);
			
			collection.add("kesaribath");
			System.out.println(collection.size());
		//	System.out.println(((Object) collection).toString());
			collection.clear();
			System.out.println("After clear...");
			System.out.println(collection.size());
		 
		 
		 
		 
		 

	
		
	}

}
