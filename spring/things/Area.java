package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Area {
	
	public Area() {
		System.out.println(System.lineSeparator());
System.out.println(" Area is running ");	
}
	@Override
public String toString() {
System.out.println("to string is running");
return "Shivanagar";
}

}
