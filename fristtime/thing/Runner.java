package com.xworkz.fristtime.thing;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.fristtime.bean.Bekary;
import com.xworkz.fristtime.bean.Hardwareshop;
import com.xworkz.fristtime.bean.Pencil;
import com.xworkz.fristtime.bean.Rubber;
import com.xworkz.fristtime.bean.Software;
import com.xworkz.fristtime.bean.SoftwareEnggring;
import com.xworkz.fristtime.configuration.springconfiguration;


public class Runner {

	public static void main(String[] args) {
		//@SuppressWarnings("resource")
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(springconfiguration.class);
		String[] ref = applicationContext.getBeanDefinitionNames();
		System.out.println(Arrays.toString(ref));

		Hardwareshop hardwareShop = applicationContext.getBean(Hardwareshop.class);
		System.out.println(hardwareShop.toString());
		
		SoftwareEnggring soft=applicationContext.getBean(SoftwareEnggring.class);
		System.out.println(soft);
		

		Software software = applicationContext.getBean(Software.class);
		System.out.println(software.toString());

		Pencil pencil = applicationContext.getBean(Pencil.class);
		System.out.println(pencil.toString());
		
		Bekary bekary=applicationContext.getBean(Bekary.class);
		System.out.println(bekary);
		
		
		Rubber rubber=applicationContext.getBean(Rubber.class);
		System.out.println(rubber.toString());
		
		

	}

}
