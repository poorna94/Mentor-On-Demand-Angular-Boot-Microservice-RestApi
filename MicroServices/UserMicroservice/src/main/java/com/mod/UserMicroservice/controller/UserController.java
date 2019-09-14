package com.mod.UserMicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mod.UserMicroservice.Model.UserModel;
import com.mod.UserMicroservice.Service.UserServiceInterface;

//@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserServiceInterface userServiceInterface;
	
	@PostMapping("/addUser")
	public ResponseEntity<UserModel> addUser(@RequestBody UserModel userData) {
		boolean userExist = userServiceInterface.userAlreadyExist(userData.getUserEmailId());
		if(userExist) {
			System.out.println("User already exist");
			return new ResponseEntity<UserModel>(userData, HttpStatus.BAD_REQUEST);
		}else {
			UserModel savedUserData = userServiceInterface.saveUser(userData);
			return new ResponseEntity<UserModel>(savedUserData,HttpStatus.ACCEPTED);
		}
	}
}
