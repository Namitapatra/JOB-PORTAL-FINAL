package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.etity.User;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User u=new User();
        HttpSession session = request.getSession();

       
        if ("admin@gmail.com".equals(username) && "admin123".equals(password)) 
        {
            session.setAttribute("userobj", u);
             u.setRole("admin");
             response.sendRedirect("admin.jsp");
        } else {
        
        	
        }
        
        } catch (Exception e) {
            e.printStackTrace();
        }
      }
    }