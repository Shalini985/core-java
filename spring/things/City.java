package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class City {
	public City() {
		System.out.println(System.lineSeparator());
System.out.println(" City is running ");	
}
	@Override
public String toString() {
System.out.println("to string is running");
return "Hassan";
}
	
	

}
