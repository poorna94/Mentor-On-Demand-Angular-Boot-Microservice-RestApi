package com.mod.MentorMicroservice.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mentor_model")
public class MentorModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long mentorId; String mentorName;
	private String mentorEmail;
	private String mentorPassword;
	private String mentorContactNo;
	private boolean mentorStatus;
	

	public Long getMentorId() {
		return mentorId;
	}
	public void setMentorId(Long mentorId) {
		this.mentorId = mentorId;
	}
	public String getMentorName() {
		return mentorName;
	}
	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}
	public String getMentorEmail() {
		return mentorEmail;
	}
	public void setMentorEmail(String mentorEmail) {
		this.mentorEmail = mentorEmail;
	}
	public String getMentorPassword() {
		return mentorPassword;
	}
	public void setMentorPassword(String mentorPassword) {
		this.mentorPassword = mentorPassword;
	}
	public String getMentorContactNo() {
		return mentorContactNo;
	}
	public void setMentorContactNo(String mentorContactNo) {
		this.mentorContactNo = mentorContactNo;
	}
	public boolean isMentorStatus() {
		return mentorStatus;
	}
	public void setMentorStatus(boolean mentorStatus) {
		this.mentorStatus = mentorStatus;
	}
	@Override
	public String toString() {
		return "MentorModel [mentorId=" + mentorId + ", mentorName=" + mentorName + ", mentorEmail=" + mentorEmail
				+ ", mentorPassword=" + mentorPassword + ", mentorContactNo=" + mentorContactNo + ", mentorStatus="
				+ mentorStatus + "]";
	}
	public MentorModel(Long mentorId, String mentorName, String mentorEmail, String mentorPassword,
			String mentorContactNo, boolean mentorStatus) {
		super();
		this.mentorId = mentorId;
		this.mentorName = mentorName;
		this.mentorEmail = mentorEmail;
		this.mentorPassword = mentorPassword;
		this.mentorContactNo = mentorContactNo;
		this.mentorStatus = mentorStatus;
	}
	
	public MentorModel() {}
	
	
	
	
}
