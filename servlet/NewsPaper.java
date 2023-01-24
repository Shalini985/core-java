package com.xworkz.tetrass.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 2,urlPatterns = "/dharma")

public class NewsPaper extends HttpServlet {
	
	public NewsPaper() {
			System.out.println("created NewsPaper");	
			}
			@Override
			protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				System.out.println("running NewsPaper" +this.getClass().getSimpleName());		

			}
			}





