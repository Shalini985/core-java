package com.xworkz.fristtime.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
	@ComponentScan("com.xworkz.fristtime.configuration")
	public class AutoWiredConfiguration {

		public AutoWiredConfiguration() {
			System.out.println("Auto wired configuration is running");
		}

		@Bean
		public int id() {
			return 10;

		}

		@Bean
		public String name() {
			return "Vijayavani";

		}

		@Bean
		public String ownerName() {
			return "Hareesha";
		}

		@Bean
		public String langauge() {
			return "Kannada";
		}

		@Bean

		public double price() {
			return 20.0;
		}

		@Bean

		public String engineName() {
			return "JCB";

		}

		@Bean
		public String engineType() {
			return "Kirloskar Engine";
		}

		@Bean
		public long number() {
			return 9900775088L;
		}

		@Bean
		public String version() {
			return "V2022";
		}

		@Bean

		public String company() {
			return "JCB";
		}

		@Bean
		public int strokes() {
			return 4;
		}

		@Bean

		public String snakeName() {
			return "Nagara Havu";
		}

		@Bean
		public double length() {
			return 5.5;
		}

		@Bean
		public String color() {
			return "red";
		}

		@Bean
		public String type() {
			return "Cobra";
		}

		@Bean
		public boolean poisionas() {
			return true;
		}

		@Bean
		public String gostName() {
			return "Yatish ";

		}

		@Bean
		public int age() {
			return 23;
		}

		@Bean
		public String gostColor() {
			return "transperent";
		}

		@Bean
		public String fatherName() {
			return "Ramanna";
		}

		@Bean
		public String motherName() {
			return "Bhagya";
		}

		@Bean
		public int fingurSize() {
			return 3;
		}

		@Bean
		public String nativename() {
			return "Hosahalli";
		}

		@Bean
		public String state() {
			return "Karnataka";
		}

		@Bean
		public String country() {
			return "India";
		}

		@Bean

		public String gostType() {
			return "normal";
		}

		@Bean
		public String dress() {
			return "saree";
		}

		@Bean
		public double gostHeight() {
			return 5.5;
		}

		@Bean
		public double gostWeight() {
			return 60;
		}

		@Bean
		public String faceType() {
			return "Normal";
		}

		@Bean
		public boolean craying() {
			return false;
		}

		@Bean
		public String ringsType() {
			return "circle";
		}

		@Bean
		public String sarytype() {
			return "Normal";
		}

		@Bean
		public String wepons() {
			return "nife";
		}

		@Bean
		public boolean fingerPrint() {
			return true;
		}

		@Bean
		public int legSize() {
			return 4;
		}
	}



