package com.example.demo;
//import java.io.Serial;



public class model {
	
	public String email;
	public String username;
	public String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
 public model (String email, String username, String password) {
	  this.email=email;
	  this.username=username;
	  this.password=password;
  }
 public model() {
	 
 }
 public model (String email, String password) {
	  this.email=email;
	  this.password=password;
 }
}
