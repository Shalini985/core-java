package com.xworkz.servlet.component;

import org.springframework.stereotype.Component;

@Component
public class SpringComponent {
	public SpringComponent() {
		System.out.println("running" + this.getClass().getSimpleName());
	}

}
