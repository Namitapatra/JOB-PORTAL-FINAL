package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Replace these with actual values or a call to a database
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form parameters
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Simple authentication logic
        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            // Successful login
            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            // Redirect to welcome or home page
            response.sendRedirect("welcome.jsp");
        } else {
            // Failed login
            response.sendRedirect("login.jsp?error=invalid");
        }
    }
}
