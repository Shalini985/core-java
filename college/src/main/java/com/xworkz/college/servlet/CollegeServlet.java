package com.xworkz.college.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


	@WebServlet(loadOnStartup = 3,urlPatterns = "/branch")
	public class CollegeServlet extends HttpServlet {

		public CollegeServlet() {
			System.out.println("Created" +this.getClass().getSimpleName());
		}
		
		@Override
		public void init() throws ServletException {
			System.out.println("init config....");
		}
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
		ServletException, IOException {
			System.out.println("Running doGet on CollegeServlet");
			
			String name = req.getParameter("CName");
			String CCode = req.getParameter("Ccode");
			String Address = req.getParameter("CAddress");
			String State = req.getParameter("CState");
			String language = req.getParameter("language");
			String CanteenName = req.getParameter("collegeCanteenName");
			String BranchName1 = req.getParameter("branchName1");
			String BranchName2 = req.getParameter("branchName2");
			String BranchName3 = req.getParameter("branchName3");
			String BranchName4 = req.getParameter("branchName4");
			String BranchName5 = req.getParameter("branchName5");
			String BranchName6 = req.getParameter("branchName6");
			String NoOfBranches = req.getParameter("NoOfbranch");
			String HodName = req.getParameter("hodName");
			String PrincipleName = req.getParameter("principleName");
			String PoneName = req.getParameter("poneName");
			String SubjectName = req.getParameter("subjectName");
			String NoOfStudent = req.getParameter("noOfstudent");
			String NoOfSubject = req.getParameter("noOfSubject");
			
			
			PrintWriter writer = resp.getWriter();
			writer.print("Running CollegeServlet Succesfully"+name+ " "+CCode+" "+Address+" "+State+" "+language+" "+CanteenName+" "+BranchName1+" "+BranchName2+" "+BranchName3+" ");

}
}