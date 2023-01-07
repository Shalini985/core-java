package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component

public class Bus {
	public Bus() {
		
	System.out.println(System.lineSeparator());
	System.out.println("bus constructor Running");
}
	@Override
	public String toString() {
		System.out.println("to string running");
		return "BMTC";
	}


}
