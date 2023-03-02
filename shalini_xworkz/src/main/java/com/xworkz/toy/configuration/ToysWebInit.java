package com.xworkz.toy.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



public class ToysWebInit extends AbstractAnnotationConfigDispatcherServletInitializer
	implements WebMvcConfigurer {

		public ToysWebInit() {
			System.out.println("Running toyswebinit");
		}

		@Override
		protected Class<?>[] getRootConfigClasses() {
			System.out.println("running getRootConfigClasses");
			return null;
		}

		@Override
		protected Class<?>[] getServletConfigClasses() {
			System.out.println("running getServletConfigClasses");
			return new Class[] {ToysConfiguration.class};
		}

		@Override
		protected String[] getServletMappings() {
			System.out.println("Running getServletMappings");
			return new String[] {"/"};
			}

			@Override
			public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
				configurer.enable();
			}
	}


