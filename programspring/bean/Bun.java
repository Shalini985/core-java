package com.xworkz.programspring.bean;

import org.springframework.stereotype.Component;

@Component
public class Bun {
	private String name;
	private String type;
	
	public Bun() {
System.out.println("bun is running");	
}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}

}
