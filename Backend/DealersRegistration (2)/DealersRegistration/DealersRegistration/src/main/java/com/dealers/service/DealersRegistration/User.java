
package com.dealers.service.DealersRegistration;

import org.springframework.data.annotation.Id;

public class User {

	@Id 
	private String id; 
	private String password; 
	private String Role;
	
	public User() {
		
	}
	
	
	public User(String id, String password, String role) {
		
		this.id = id;
		this.password = password;
		Role = role;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	
	
	
	
	
	}