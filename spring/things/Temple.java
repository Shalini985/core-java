package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Temple {
	public Temple() {
		System.out.println(System.lineSeparator());
System.out.println(" temple is running ");	
}
	@Override
public String toString() {
System.out.println("to string is running");
return "Harihareshwara";
}

}
