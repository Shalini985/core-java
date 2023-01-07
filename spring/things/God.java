package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class God {
	public God() {
		System.out.println(System.lineSeparator());
System.out.println(" God is running ");	
}
	@Override
public String toString() {
System.out.println("to string is running");
return "Anjanaya";
}

}
