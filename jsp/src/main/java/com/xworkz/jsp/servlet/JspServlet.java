package com.xworkz.jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.runtime.HttpJspBase;


	@WebServlet(loadOnStartup = 1, urlPatterns = "/jsp")
	public class JspServlet extends HttpServlet {

		public JspServlet() {
			System.out.println("Created" + this.getClass().getSimpleName());
		}

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Running JspServlet on using post method");

			String fname = req.getParameter("fname");
			String lname = req.getParameter("lname");
			String gender = req.getParameter("gender");
			String reason = req.getParameter("reason");
			String address = req.getParameter("address");
			
            System.out.println(fname);
            System.out.println(lname);
            System.out.println(address);
            System.out.println(gender);
            System.out.println(reason);



			RequestDispatcher dispatcher = req.getRequestDispatcher("contact.jsp");
			req.setAttribute("fname", fname);
			req.setAttribute("lname", lname);
			req.setAttribute("gender", gender);
			req.setAttribute("reason", reason);
			req.setAttribute("address", address);
			dispatcher.forward(req, resp);
		}

	}


