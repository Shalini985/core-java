package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Chocolate {
	public Chocolate() {
		System.out.println(System.lineSeparator());
System.out.println(" chacolate is running ");	
}
	@Override
public String toString() {
System.out.println("to string is running");
return "Diary milk";
}
	

}
