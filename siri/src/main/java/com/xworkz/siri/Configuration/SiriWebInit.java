package com.xworkz.siri.Configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SiriWebInit  extends AbstractAnnotationConfigDispatcherServletInitializer
	implements WebMvcConfigurer {
public SiriWebInit () {
	System.out.println("Running SiriwebInit");
}

@Override
protected Class<?>[] getRootConfigClasses() {
	System.out.println("Running getRootConfigClasses");
	return null;
}

@Override
protected Class<?>[] getServletConfigClasses() {
	System.out.println("Running getServletConfigClasses");
	return new Class[] { SiriConfiguration.class };
}

@Override
protected String[] getServletMappings() {
	System.out.println("getServletMappings");

	return new String[] { "/" };
}

@Override
public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {

	configurer.enable();
}


}
