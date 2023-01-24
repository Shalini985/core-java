package com.xworkz.tetrass.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 2,urlPatterns = "/hassan")

public class Temple extends HttpServlet {
	
	
		

			public Temple() {
		System.out.println("created Temple");	
		}
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("running Temple" +this.getClass().getSimpleName());		

		}
		}


