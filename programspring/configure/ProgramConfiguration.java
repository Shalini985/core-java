package com.xworkz.programspring.configure;

import java.time.Month;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.programspring.bean.Actor;
import com.xworkz.programspring.bean.Bun;
import com.xworkz.programspring.bean.Rocket;
import com.xworkz.programspring.bean.Season;


@Configuration
@ComponentScan("com.xworkz.programspring")

public class ProgramConfiguration {
	public ProgramConfiguration() {
System.out.println("Created  bunconfifuration");
	}

	@Bean("gslv")
	public Rocket rocket() {
		System.out.println("rocket in config");
		Rocket rocket = new Rocket("+91", "GSLV", 1265415263);
		System.out.println(rocket.toString());
		return rocket;
	}
	
	@Bean("rainy")
	public Season season() {
		System.out.println("season in config");
		Season season = new Season("rainy", 5, Month.MARCH);
		return season;
	}
	
	@Bean("darshan")
	public Actor actor() {
		System.out.println("actor in congig");
		Actor actor = new Actor();
		actor.setName("Darshan");
		actor.setLanguage("Kannada");
		actor.setAge(50);
		return actor;
	}
}