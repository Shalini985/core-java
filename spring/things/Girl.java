package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Girl {
	public Girl() {
		System.out.println(System.lineSeparator());
		System.out.println("Girl constructor Running");
	}
	@Override
	public String toString() {
System.out.println("to string running");	
return "buatyful";
	}

}
