package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DB.DBConnect;

@WebServlet("/add_user")
public class RegisterServlet  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String username = req.getParameter("username");
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			String confirmpassword = req.getParameter("confirmpassword");
			
			UserDAO dao =new UserDAO(DBConnect.getConn());
			
			User u = new User(username, email, password, confirmpassword);
			
			
			
		}
	
	}

	
}
