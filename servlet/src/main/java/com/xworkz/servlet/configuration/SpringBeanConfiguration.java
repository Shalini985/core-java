package com.xworkz.servlet.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.servlet")
public class SpringBeanConfiguration {
	public SpringBeanConfiguration() {
		System.out.println("running" + this.getClass().getSimpleName());
	}

}
