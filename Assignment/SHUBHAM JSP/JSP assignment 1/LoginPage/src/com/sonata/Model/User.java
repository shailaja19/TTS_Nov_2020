package com.sonata.Model;

public class User {
	String email;
	String pass;
	public User(String email,String pass) {
		this.email=email;
		this.pass=pass;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

}
