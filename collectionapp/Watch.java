package com.xwork.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Watch {
	public static void main(String[] args) {
		String watch1="Apple";
		String watch2="HMT";
		String watch3="Sonata";
		String watch4="Titan";
		String watch5="FastTrack";
		Collection<String> watchs=new ArrayList<String>();
		watchs.add(watch5);
		watchs.add(watch4);
		watchs.add(watch3);
		watchs.add(watch2);
		watchs.add(watch1);
		watchs.add("fast");
		System.out.println(watchs.size());
		
		Iterator<String> itr=watchs.iterator();
		while(itr.hasNext()) {
			String element=itr.next();
			System.out.println(element);
		}
	}

}
