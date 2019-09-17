package com.mod.UserMentorMicroservice.Service;

import com.mod.UserMentorMicroservice.Model.UserMentorModel;

public interface UserMentorServiceInterface {
	
	public UserMentorModel saveproposal(UserMentorModel userMentorData);
	public UserMentorModel getUserConnection(Long id);
	public UserMentorModel getMentorConnection(Long id);
}
