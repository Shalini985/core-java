package com.xworkz.fristtime.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
	public class Engine {

		private String name;
		private String type;
		@Autowired
		private long number;
		@Autowired
		private String version;
		private String company;
		private int strokes;

		@Autowired
		public Engine( @Qualifier("engineName") String name, @Qualifier("engineType") String type, String company) {
			super();
			this.name = name;
			this.type = type;
			this.company = company;
		}

		@Override
		public String toString() {
			return "Engine [name=" + name + ", type=" + type + ", Number=" + number + ", version=" + version + ", company="
					+ company + ", strokes=" + strokes + "]";
		}

		@Autowired
		public void setStrokes(int strokes) {
			this.strokes = strokes;
		}
	

}
