package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.etity.User;

public class UserDAO {

	private Connection conn;

	public UserDAO(Connection conn) {
		this.conn = conn;
	}

	public boolean addUser(User u) {
		boolean f = false;
		try {
			
			String sql = "INSERT INTO user (username, email, password, confirmpassword, role) VALUES (?, ?, ?, ?, ?)";
			
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, u.getUsername());
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getPassword());
			ps.setString(4, u.getConfirmpassword());
			ps.setString(5, u.getRole() != null ? u.getRole() : "user");  

			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	public User login(String email,String password)
	{
		User u=null;
		try {
			String sql = "select * from user where email=? and password=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				u = new User();
				u.setId(rs.getInt(1));
				u.setUsername(rs.getString(2));
				u.setEmail(rs.getString(3));
				u.setPassword(rs.getString(4));
				u.setConfirmpassword(rs.getString(5));
				u.setRole(rs.getString(6));	
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return u;
	}
}
