package com.mod.UserMentorMicroservice.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mod.UserMentorMicroservice.Model.UserMentorModel;

@Repository
public interface UserMentorDao extends JpaRepository<UserMentorModel, Long> {
	
	public UserMentorModel findByUserIdAndMentorIdAndSkillId(Long uId, Long mId, Long sId);
	public UserMentorModel findByUserId(Long uId);
	public UserMentorModel findByMentorId(Long mId);
}
