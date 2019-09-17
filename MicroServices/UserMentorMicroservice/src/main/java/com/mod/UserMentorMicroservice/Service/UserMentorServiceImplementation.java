package com.mod.UserMentorMicroservice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mod.UserMentorMicroservice.Dao.UserMentorDao;
import com.mod.UserMentorMicroservice.Model.UserMentorModel;

@Service
public class UserMentorServiceImplementation implements UserMentorServiceInterface {

	@Autowired
	private UserMentorDao userMentorDao;
	
	@Override
	public UserMentorModel saveproposal(UserMentorModel userMentorData) {
		return userMentorDao.save(userMentorData);
	}

}
