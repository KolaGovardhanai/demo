package com.zensar;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int password = Integer.parseInt(request.getParameter("password"));
		LoginDao dao= new LoginDao();
		Login l1 = dao.getLogin(password);
		RequestDispatcher rd = request.getRequestDispatcher("showLogin.jsp");
		rd.forward(request,response);
	}

	
}
