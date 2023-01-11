package com.xworkz.programspring.bean;

import java.time.Month;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {
	String name;
	int duration;
	Month startingMonth;

	public Season() {
		// TODO Auto-generated constructor stub
	}

	public Season(@Value("Summer") String name, @Value("5") int duration,
			@Value("Month.march") Month startingMonth) {
		this.name = name;
		this.duration = duration;
		this.startingMonth = startingMonth;
	}

	@Override
	public String toString() {
		return "Season [name=" + name + ", duration=" + duration + ", startingMonth=" + startingMonth + "]";
	}






}
