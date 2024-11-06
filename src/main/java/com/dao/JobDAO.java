package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.etity.Jobs;

public class JobDAO {
	
	private Connection conn;

	public JobDAO(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public boolean addJobs(Jobs j) {
		boolean f = false;
		
		try {
			String sql = "insert into jobs(title,location,category,status,description) values(?,?,?,?,?)"; 
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, j.getTitle());
			ps.setString(2, j.getLocation());
			ps.setString(3, j.getCatagory());
			ps.setString(4, j.getStatus());
			ps.setString(5, j.getDescription());
			 
			int i = ps.executeUpdate();
			
			if (i == 1) {
				f = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;  
	}
}
