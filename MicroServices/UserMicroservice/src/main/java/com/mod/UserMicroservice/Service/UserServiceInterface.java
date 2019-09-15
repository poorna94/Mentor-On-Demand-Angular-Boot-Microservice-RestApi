package com.mod.UserMicroservice.Service;

import org.springframework.stereotype.Service;

import com.mod.UserMicroservice.Model.UserModel;


public interface UserServiceInterface {
	
	public UserModel saveUser(UserModel userData);
	public boolean userAlreadyExist(String userEmail);
}
