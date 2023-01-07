package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Mlik {
	public Mlik() {
   System.out.println("milk is Running");
}
	@Override
	public String toString() {
System.out.println("to string is running");		
return "Nadini";
	}

}
