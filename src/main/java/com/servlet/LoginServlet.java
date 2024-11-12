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
        	
        	
        	UserDAO dao=new UserDAO(DBConnect.getConn());
            User user=dao.login(username, password);
            
            if(user!=null)
            {
            	session.setAttribute("userobj", user);
            	response.sendRedirect("home.jsp");
            	
            }else {
            	session.setAttribute("SuccMsg", "Invalid Email & Password");
            	response.sendRedirect("login.jsp");
            }
            
        	
        	
        }
        
        } catch (Exception e) {
            e.printStackTrace();
        }
      }
    }