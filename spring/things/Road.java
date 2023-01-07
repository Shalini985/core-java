package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Road {
	public Road() {
		System.out.println(System.lineSeparator());

		System.out.println("Road Running Sucessfully");
	}

	@Override
	public String toString() {
		System.out.println("Running to string");
		return "Shalini";
	}

}
