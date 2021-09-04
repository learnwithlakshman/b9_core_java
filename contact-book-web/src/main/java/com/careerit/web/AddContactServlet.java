package com.careerit.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.careerit.web.domain.Contact;

/**
 * Servlet implementation class AddContactServlet
 */
@WebServlet("/addcontact")
public class AddContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String mobile = request.getParameter("mobile");
			
			
			// validation
			//Write DB
			Contact contact = new Contact(name,email,mobile);
			request.setAttribute("contact", contact);
			RequestDispatcher rd = request.getRequestDispatcher("confirmandadd");
	     	rd.forward(request,response);
//			response.sendRedirect("homepage.html");
	}

}
