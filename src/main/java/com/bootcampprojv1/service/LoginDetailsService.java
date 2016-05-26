package com.bootcampprojv1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcampprojv1.model.LoginDetails;
import com.bootcampprojv1.model.LoginDetailsDAO;

@Service
public class LoginDetailsService {
	
	@Autowired
	private LoginDetailsDAO loginDetailsDAO;
	
	public LoginDetails verifyLogin(String loginID,String password)
	{
		return loginDetailsDAO.authenticateLogin(loginID, password);
	}

}
