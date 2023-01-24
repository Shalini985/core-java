package com.xworkz.republic.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.w3c.dom.css.Rect;

public class Freedom  extends HttpServlet{
	public Freedom() {
System.out.println("Freedom ic created");
}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet in freedom fighter");
		
		String name=req.getParameter("figtherName");
		String alive=req.getParameter("alive");
		String mode=req.getParameter("mode");
		String weapon=req.getParameter("weapon");
		
		System.out.println(name);
		System.out.println(alive);
		System.out.println(mode);
		System.out.println(weapon);
		
		

	PrintWriter writer=resp.getWriter();
	writer.print("<html>");
	writer.print("<body>");
	writer.print("<h1>");
	writer.print("<span style='color:green;'>");
	writer.print("Fighter Name"+name + "is sent succefully......");
	writer.print("</span>");
	writer.print("</h1>");
	writer.print("</body>");
	writer.print("</html>");
	resp.setContentType("text/html");
	
	
	
	
	///writer.print("figther Name"+name+"is sent successfully.......");
	
	
	
	
	
	}
}
