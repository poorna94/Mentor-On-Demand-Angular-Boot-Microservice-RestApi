package com.mod.UserMentorMicroservice.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mod.UserMentorMicroservice.Model.UserMentorModel;

@Repository
public interface UserMentorDao extends JpaRepository<UserMentorModel, Long> {

}
