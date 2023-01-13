package com.xworkz.fristtime.thing;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.fristtime.bean.Engine;
import com.xworkz.fristtime.bean.Gost;
import com.xworkz.fristtime.bean.NewsPaper;
import com.xworkz.fristtime.bean.Snake;
import com.xworkz.fristtime.configuration.AutoWiredConfiguration;


public class AutowirdRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutoWiredConfiguration.class);
		System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));

		NewsPaper newsPaper = applicationContext.getBean(NewsPaper.class);
		System.out.println(newsPaper.toString());

		Engine engine = applicationContext.getBean(Engine.class);
		System.out.println(engine.toString());
		
		Snake snake=applicationContext.getBean(Snake.class);
		System.out.println(snake.toString());
		
		
		Gost gost=applicationContext.getBean(Gost.class);
		System.out.println(gost.toString());
		

	}





}
