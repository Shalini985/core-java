package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Mask {
	public Mask() {
System.out.println("mask is the ruuning");
}
	@Override
	public String toString() {
System.out.println("to string is running");		
return "N95";
	}

}
