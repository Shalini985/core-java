package com.xworkz.programspring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Rocket {
	@Value("India")
	String country;
	@Value("FLIGHT")
	String name;
	@Value("98765435")
	double price;

	public Rocket() {
		System.out.println("Rocket no-argument Constractors....");
	}

	public Rocket(String country, String name, double price) {

		this.country = country;
		this.name = name;
		this.price = price;
		toString();
	}

	@Override
	public String toString() {
		return "Rocket [country=" + country + ", name=" + name + ", price=" + price + "]";
	}


}
