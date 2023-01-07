package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Cycle {
	public Cycle() {
System.out.println("Cycle is running");
}
	@Override
	public String toString() {
System.out.println("to string will ruuning");
 return "Sharath";
	}

}
