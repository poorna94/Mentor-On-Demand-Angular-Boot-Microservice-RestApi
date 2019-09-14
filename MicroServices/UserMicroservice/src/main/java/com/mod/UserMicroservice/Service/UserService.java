package com.mod.UserMicroservice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mod.UserMicroservice.Dao.UserDaoInterface;
import com.mod.UserMicroservice.Model.UserModel;

@Service
public class UserService implements UserServiceInterface {

	@Autowired
	UserDaoInterface userDao;
	
	@Override
	public UserModel saveUser(UserModel userData) {
		return userDao.save(userData);
	}

	@Override
	public boolean userAlreadyExist(String userEmail) {
		if(userDao.findByUserEmailId(userEmail)!=null)
			return true;
		else
			return false;
	}

}
