package com.xwork.collectionapp;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftwareCompany {
	public static void main(String[] args) {
		String name1="Infoyes";
		String name2="wibro";
		String name3="Capgimini";
		String name4="Acenture";
		String name5="dellite";
		String name7="toxes";
		String name6="Acer";
		String name8="Accuvate";
		String name9="Singiwise";
		String name10="Axior";
		String name11="AppSource";
		String name12="IBM";
		String name13="Sigma";
		String name14="UnStop";
		String name15="Keerthi Technology";
		String name16="Ahana";
		String name17="MNC";
		String name18="Amzon";
		String name19="vignivas";
		String name20="MicroSoft";
		Collection<String> name=new ArrayList<String>();
		name.add(name20);
		name.add(name19);
		name.add(name18);
		name.add(name17);
		name.add(name16);
		name.add(name15);
		name.add(name14);
		name.add(name13);
		name.add(name12);
		name.add(name11);
		name.add(name10);
		name.add(name9);
		name.add(name8);
		name.add(name7);
		name.add(name6);
		name.add(name5);
		name.add(name4);
		name.add(name3);
		name.add(name2);
		name.add(name1);
		
		System.out.println(name.size());
		
//		for( String element:name) {
//			System.out.println(element);
//			
//		}
		System.out.println("========");
		Iterator<String> itr=name.iterator();
		while(itr.hasNext()) {
			String element=itr.next();
			System.out.println(element);
		}
		}

}
