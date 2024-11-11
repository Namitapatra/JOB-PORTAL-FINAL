package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.DB.DBConnect;
import com.dao.UserDAO;
import com.etity.User;

@WebServlet("/add_user")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String username = req.getParameter("username");
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			String confirmpassword = req.getParameter("confirmpassword");
			
            if (username == null || username.isEmpty() ||
                    email == null || email.isEmpty() ||
                    password == null || password.isEmpty() ||
                    confirmpassword == null || confirmpassword.isEmpty()) {
                    // Set error message if any field is empty
                    HttpSession session = req.getSession();
                    session.setAttribute("errorMsg", "All fields are required. Please fill in all the details.");
                    resp.sendRedirect("register.jsp");  // Redirect to registration page with error message
                    return; // Exit the method to prevent further processing
                }

			if (!password.equals(confirmpassword)) {
                // Passwords do not match
                HttpSession session = req.getSession();
                session.setAttribute("errorMsg", "Passwords do not match. Please try again.");
                resp.sendRedirect("register.jsp");
                return; // Exit the method to prevent further processing
            }

			UserDAO dao = new UserDAO(DBConnect.getConn());

			User u = new User();
			u.setUsername(username);
			u.setEmail(email);
			u.setPassword(password);
			u.setConfirmpassword(confirmpassword);
			u.setRole("user");  

			boolean f = dao.addUser(u);

			HttpSession session = req.getSession();
			if (f) {
				session.setAttribute("succMsg", "Registration Successful");
				resp.sendRedirect("register.jsp");
			} else {
				session.setAttribute("errorMsg", "Something went wrong on the server");
				resp.sendRedirect("register.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();
			 HttpSession session = req.getSession();
	            session.setAttribute("errorMsg", "An error occurred while processing the registration.");
	            resp.sendRedirect("register.jsp");
	        }
		}
	}

