package com.etity;

public class User {

	private int id;
	private String username;
	private String email;
	private String password;
	private String confirmpassword;
	private String role;

	public User(String name, String email, String password, String confirmpassword, String role) {
		super();
		this.username = name;
		this.email = email;
		this.password = password;
		this.confirmpassword = confirmpassword;
		this.role = role;
	}

	public User() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {  // Fixed method name to getUsername
		return username;
	}

	public void setUsername(String username) {  // Fixed method name to setUsername
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpassword() {  
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
