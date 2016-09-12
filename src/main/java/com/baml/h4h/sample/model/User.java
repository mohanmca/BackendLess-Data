package com.baml.h4h.sample.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	private String email;
	private int role;
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
