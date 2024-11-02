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

    // Updated hardcoded credentials
    private static final String USERNAME = "admin@gmail.com";
    private static final String PASSWORD = "admin123";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve username and password from the form
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Check credentials
        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            // Successful login, start a session
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            
            // Redirect to a welcome page or dashboard
            response.sendRedirect("admin.jsp");
        } else {
            // Invalid login, redirect back to login page with error message
            response.sendRedirect("login.jsp?error=invalid");
        }
    }
}
