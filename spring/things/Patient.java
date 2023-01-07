package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Patient {
	public Patient() {
System.out.println("Patient is full critical");
}
	@Override
	public String toString() {
System.out.println("To  string running");
return "Shalini";
	}

}
