package com.xworkz.fristtime.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Software {
	@Autowired
	@Qualifier("name")
	private String name;
	@Autowired
	@Qualifier("varsion")
	private String version;
	@Autowired
	@Qualifier("developer")
	private String developer;
	@Autowired
	@Qualifier("free")
	private boolean free;
	

	
	@Override
	public String toString() {
		return "Software [name=" + name + ", version=" + version + ", developer=" + developer + ", free=" + free
				+ "]";
	}



	
	 

}
