package com.xworkz.spring.boot;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuare.SpringConfiguaration;
import com.xworkz.spring.things.Application;
import com.xworkz.spring.things.Area;
import com.xworkz.spring.things.Bus;
import com.xworkz.spring.things.Chocolate;
import com.xworkz.spring.things.City;
import com.xworkz.spring.things.Cycle;
import com.xworkz.spring.things.Fish;
import com.xworkz.spring.things.Girl;
import com.xworkz.spring.things.God;
import com.xworkz.spring.things.Mall;
import com.xworkz.spring.things.Mask;
import com.xworkz.spring.things.Mlik;
import com.xworkz.spring.things.Park;
import com.xworkz.spring.things.Patient;
import com.xworkz.spring.things.Road;
import com.xworkz.spring.things.Temple;

public class RoadRunner {

	public static void main(String[] args) {
		System.out.println("MAin running");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguaration.class);
		Road ref = applicationContext.getBean(Road.class);

		System.out.println(ref.toString());

		Girl ref1 = applicationContext.getBean(Girl.class);
		System.out.println(ref1);
		
		System.out.println(System.lineSeparator());
		
		Bus ref2 = applicationContext.getBean(Bus.class);
		System.out.println(ref2);
		
		System.out.println(System.lineSeparator());
		
		Cycle ref3 = applicationContext.getBean(Cycle.class);
		System.out.println(ref3);
		
		System.out.println(System.lineSeparator());
		
		Mlik ref4 = applicationContext.getBean(Mlik.class);
		System.out.println(ref4);
		
		System.out.println(System.lineSeparator());
		
		Mask ref5 = applicationContext.getBean(Mask.class);
		System.out.println(ref5);
		
		System.out.println(System.lineSeparator());

		Patient ref6 = applicationContext.getBean(Patient.class);
		System.out.println(ref6);
		
		System.out.println(System.lineSeparator());

		Chocolate ref7= applicationContext.getBean(Chocolate.class);
		System.out.println(ref7);
		
		System.out.println(System.lineSeparator());

		Area ref8 = applicationContext.getBean(Area.class);
		System.out.println(ref8);
		
		System.out.println(System.lineSeparator());

		City ref9= applicationContext.getBean(City.class);
		System.out.println(ref9);
		
		System.out.println(System.lineSeparator());

		Fish ref10= applicationContext.getBean(Fish.class);
		System.out.println(ref10);
		
		System.out.println(System.lineSeparator());

		Temple  ref11 = applicationContext.getBean(Temple.class);
		System.out.println(ref11);
		
		System.out.println(System.lineSeparator());

		God ref12 = applicationContext.getBean(God.class);
		System.out.println(ref12);
		
		System.out.println(System.lineSeparator());

		Park ref13 = applicationContext.getBean(Park.class);
		System.out.println(ref13);
		
		System.out.println(System.lineSeparator());

		Mall ref14 = applicationContext.getBean(Mall.class);
		System.out.println(ref14);
		
		System.out.println(System.lineSeparator());

		Application ref15= applicationContext.getBean(Application.class);
		System.out.println(ref15);
		
		

		



	}

}
