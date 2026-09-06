package com.springboot.springformvalidation.entities;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class LoginDetails {

	@NotBlank(message = "Username cannot be empty!")
	@Size(min = 3, max = 12, message = "Username must be between 3 - 12 characters!")
	private String userName;
	
	@Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", message="Invalid Email!")
	private String userEmail;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	@Override
	public String toString() {
		return "LoginDetails [userName=" + userName + ", userEmail=" + userEmail + "]";
	}
	
	
}
