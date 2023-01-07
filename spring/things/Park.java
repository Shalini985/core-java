package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Park {
	public Park() {
System.out.println("is running");
}
	@Override
	public String toString() {
System.out.println("to string running");		
return "Chinnara Loka";
	}

}
