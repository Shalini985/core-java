package com.xworkz.fristtime.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
	public class Snake {

		private String name;
		@Autowired
		private double length;
		@Autowired
		private String color;
		private boolean poisionas;
		private String type;

		@Autowired
		public Snake( @Qualifier("snakeName") String name, boolean poisionas, String type) {
			super();
			this.name = name;
			this.poisionas = poisionas;
			this.type = type;
		}

		@Override
		public String toString() {
			return "Snake [name=" + name + ", length=" + length + ", color=" + color + ", poisionas=" + poisionas
					+ ", type=" + type + "]";
		}

	

}
