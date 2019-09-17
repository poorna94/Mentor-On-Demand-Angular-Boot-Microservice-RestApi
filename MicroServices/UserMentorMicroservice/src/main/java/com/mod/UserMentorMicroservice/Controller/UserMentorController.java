package com.mod.UserMentorMicroservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mod.UserMentorMicroservice.Model.UserMentorModel;
import com.mod.UserMentorMicroservice.Service.UserMentorServiceInterface;

@CrossOrigin(origins ="http://localhost:4200")
@RestController
@RequestMapping("/exchange")
public class UserMentorController {
	
	@Autowired
	private UserMentorServiceInterface userMentorInterface;
	
	@PostMapping("/add")
	public ResponseEntity<UserMentorModel> addProposal(@RequestBody UserMentorModel userMentorData){
		UserMentorModel savedRelationship = userMentorInterface.saveproposal(userMentorData);
		if(savedRelationship!=null)
		return new ResponseEntity<UserMentorModel>(savedRelationship,HttpStatus.OK);
		else
		return new ResponseEntity<UserMentorModel>(savedRelationship,HttpStatus.CONFLICT);
	}
	
	@GetMapping("/userData/:id")
	public ResponseEntity<UserMentorModel> getUserConnection(@PathVariable Long id){
		UserMentorModel userConnection = userMentorInterface.getUserConnection(id);
		if(userConnection!=null)
			return new ResponseEntity<UserMentorModel>(userConnection,HttpStatus.OK);
		else
			return new ResponseEntity<UserMentorModel>(userConnection,HttpStatus.CONFLICT);
	}
}
