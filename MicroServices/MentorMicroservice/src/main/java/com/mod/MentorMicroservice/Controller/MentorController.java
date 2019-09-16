package com.mod.MentorMicroservice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mod.MentorMicroservice.Model.MentorModel;
import com.mod.MentorMicroservice.Service.MentorServiceInterface;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping("/mentor")
public class MentorController {
	
	@Autowired
	MentorServiceInterface mentorService;
	
	
	//Adding a new mentor
	@PostMapping("/addMentor")
	public ResponseEntity<MentorModel> registerMentor(@RequestBody MentorModel mentorData){
		if(mentorService.isMentorAlreadyExist(mentorData.getMentorEmail())) {
			return new ResponseEntity<MentorModel>(mentorData,HttpStatus.CONFLICT);
		}else {
			return new ResponseEntity<MentorModel>(mentorService.saveMentor(mentorData),HttpStatus.OK);
		}	
	}
	
	//authenticating a user
	@PostMapping("/authenticateUser")
	public ResponseEntity<MentorModel> authenticateMentor(@RequestBody MentorModel mentorData) {
		MentorModel mentor = mentorService.mentorAuthenticate(mentorData.getMentorEmail(), mentorData.getMentorPassword());
		if(mentor!=null) {
			return new ResponseEntity<MentorModel>(mentor,HttpStatus.OK);
		}else {
			return new ResponseEntity<MentorModel>(mentorData,HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/mentors")
	public ResponseEntity<List<MentorModel>> getAllMentors(){
		return new ResponseEntity<List<MentorModel>>(mentorService.getAllMentors(),HttpStatus.OK);
	}
}
