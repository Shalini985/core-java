package com.xworkz.programspring.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.programspring.bean.Actor;
import com.xworkz.programspring.bean.Bun;
import com.xworkz.programspring.bean.Rocket;
import com.xworkz.programspring.bean.Season;
import com.xworkz.programspring.configure.ProgramConfiguration;

public class BunRunner {
	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(ProgramConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
//		Bun bun = container.getBean("veg", Bun.class);
//		System.out.println("\n"+bun.toString());
//
//		Bun sweet = container.getBean("sweet", Bun.class);
//		System.out.println("\n"+sweet.toString());
		
		System.out.println("=========================================================");
		Actor actor = container.getBean("darshan",Actor.class);
		System.out.println(actor.toString());
	

		
		System.out.println("=========================================================");
		
		Season season = container.getBean("season", Season.class);
		System.out.println("\n"+season.toString());
		
		Season rainy = container.getBean("rainy", Season.class);
		System.out.println("\n"+rainy.toString());
		System.out.println("====================================================");
		
		Rocket rocket = container.getBean("rocket", Rocket.class);
		System.out.println("\n"+rocket.toString());

		Rocket gslv = container.getBean("gslv", Rocket.class);
		System.out.println("\n"+gslv.toString());

}
}