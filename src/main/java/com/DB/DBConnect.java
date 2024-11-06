package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	private static Connection conn;
	
	public static Connection  getConn;
	{
		
		try {
			
			if (conn == null) {
				Class.forName("com.mysq.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/job_portal","root","Namita220301120155");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		if(conn==null)
		{
			
		}
		
	}
	

}
