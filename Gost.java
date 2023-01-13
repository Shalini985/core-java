package com.xworkz.fristtime.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
	public class Gost {

		private String name;
		private int age;
		private String color;
		private String fatherName;
		private String motherName;
		private int fingurSize;
		private String nativename;
		private String state;
		private String country;
		private String type;
		@Autowired
		private String dress;
		@Autowired
		@Qualifier("gostHeight")
		private double hight;
		@Autowired
		@Qualifier("gostWeight")
		private double weight;
		@Autowired

		private String faceType;
		@Autowired
		private boolean craying;
		@Autowired
		private String ringsType;
		@Autowired
		private String sarytype;
		@Autowired
		private String wepons;
		@Autowired
		private boolean fingerPrint;
		@Autowired
		private int legSize;

		public Gost(@Qualifier("gostName") String name, int age, @Qualifier("gostColor") String color, String fatherName,
				String motherName, int fingurSize, String nativename, String state, String country,
				@Qualifier("gostType") String type) {
			super();
			this.name = name;
			this.age = age;
			this.color = color;
			this.fatherName = fatherName;
			this.motherName = motherName;
			this.fingurSize = fingurSize;
			this.nativename = nativename;
			this.state = state;
			this.country = country;
			this.type = type;
		}

		@Override
		public String toString() {
			return "Gost [name=" + name + ", age=" + age + ", color=" + color + ", fatherName=" + fatherName
					+ ", motherName=" + motherName + ", fingurSize=" + fingurSize + ", nativename=" + nativename
					+ ", state=" + state + ", country=" + country + ", type=" + type + ", dress=" + dress + ", hight="
					+ hight + ", weight=" + weight + ", faceType=" + faceType + ", craying=" + craying + ", ringsType="
					+ ringsType + ", sarytype=" + sarytype + ", wepons=" + wepons + ", fingerPrint=" + fingerPrint
					+ ", legSize=" + legSize + "]";
		}
	}


