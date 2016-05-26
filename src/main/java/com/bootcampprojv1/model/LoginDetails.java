package com.bootcampprojv1.model;

import javax.persistence.*;


@Entity
public class LoginDetails {
	
	@Id
	private String LoginId;
	private String Password;

	public LoginDetails(String loginId, String password) {
		super();
		LoginId = loginId;
		Password = password;
	}

	public LoginDetails() {
	}

	public String getLoginId() {
		return LoginId;
	}

	public String getPassword() {
		return Password;
	}

	public void setLoginId(String loginId) {
		LoginId = loginId;
	}

	public void setPassword(String password) {
		Password = password;
	}

}