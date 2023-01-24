package com.xworkz.king.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 2,urlPatterns="/Raja")
public class KingServlet extends HttpServlet {
	public KingServlet() {
System.out.println("created"+this.getClass().getSimpleName());	
}
@Override
public void init() throws ServletException {
	System.out.println("init config....");
}
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
ServletException, IOException {
	System.out.println("running doget on kingServlet");;
	String name=req.getParameter("name");
	String region=req.getParameter("region");
	String noOfQueens=req.getParameter("noOfQueens");
	String dob=req.getParameter("dob");
	String dod=req.getParameter("dod");
	
	PrintWriter writer=resp.getWriter();
	writer.print("Running kingServlet Succefully"+name+""+region+""+noOfQueens+""+dob+""+dod);
	
	
	
	
	
}

}
