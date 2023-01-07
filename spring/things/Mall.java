package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Mall {
	public Mall() {
		System.out.println(System.lineSeparator());
System.out.println(" mall is running ");	
}
	@Override
public String toString() {
System.out.println("to string is running");
return "Orian";
}

}
