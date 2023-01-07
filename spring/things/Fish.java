package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Fish {
	public Fish() {
		System.out.println(System.lineSeparator());
System.out.println(" fish is running ");	
}
	@Override
public String toString() {
System.out.println("to string is running");
return "Bangade";
}

}
