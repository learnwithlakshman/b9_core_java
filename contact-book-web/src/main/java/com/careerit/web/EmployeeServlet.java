package com.careerit.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.careerit.web.domain.Employee;
import com.careerit.web.service.EmployeeService;
import com.careerit.web.service.EmployeeServiceImpl;
import com.careerit.web.service.Page;

@WebServlet("/viewemployees")
public class EmployeeServlet extends HttpServlet {
	
		private EmployeeService empService;
		
		public EmployeeServlet() {
			empService = new EmployeeServiceImpl();
		}
		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			int page = 0;
			int size = 20;
			String pageNumber = req.getParameter("page");
			if(pageNumber != null) {
				page = Integer.parseInt(pageNumber);
			}
			String sizeStr = req.getParameter("size");
			if(sizeStr != null) {
				size = Integer.parseInt(sizeStr);
			}
			
			Page<Employee> pageObj = empService.getAllEmployees(page,size);
			req.setAttribute("page", pageObj);
			RequestDispatcher rd = req.getRequestDispatcher("viewemployees.jsp");
			rd.forward(req, resp);
		}
}
