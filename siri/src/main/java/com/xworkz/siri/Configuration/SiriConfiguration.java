package com.xworkz.siri.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
	@ComponentScan("com.xworkz.siri")
	public class SiriConfiguration {
		public SiriConfiguration() {
			System.out.println("Running siriConfuguration");
		}


}
