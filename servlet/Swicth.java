package com.xworkz.tetrass.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 2,urlPatterns = "/jaya")
public class Swicth extends HttpServlet {
	public Swicth() {
				System.out.println("created Swicth");	
				}
				@Override
				protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
					System.out.println("running Swicth" +this.getClass().getSimpleName());		

				}
				}




