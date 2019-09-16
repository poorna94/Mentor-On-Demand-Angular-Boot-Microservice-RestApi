package com.mod.UserMentorMicroservice.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.persistence.Id;


@Entity
@Table(name="User_Mentor_Model")
public class UserMentorModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Long Id;
	
	@NotBlank
	private Long userId;
	
	@NotBlank
	private Long mentorId;
	
	@NotBlank
	private Long skillId;

	@NotBlank
	private boolean userProposal;
	
	@NotBlank
	private boolean mentorProposal;
	
	@NotBlank
	private boolean userReconfirmProposal;
	
	private double userRating;
	
	private int userProgress;
	
	private String feedback;

	public double getUserRating() {
		return userRating;
	}

	public void setUserRating(double userRating) {
		this.userRating = userRating;
	}

	public int getUserProgress() {
		return userProgress;
	}

	public void setUserProgress(int userProgress) {
		this.userProgress = userProgress;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public boolean isUserProposal() {
		return userProposal;
	}

	public void setUserProposal(boolean userProposal) {
		this.userProposal = userProposal;
	}

	public boolean isMentorProposal() {
		return mentorProposal;
	}

	public void setMentorProposal(boolean mentorProposal) {
		this.mentorProposal = mentorProposal;
	}

	public boolean isUserReconfirmProposal() {
		return userReconfirmProposal;
	}

	public void setUserReconfirmProposal(boolean userReconfirmProposal) {
		this.userReconfirmProposal = userReconfirmProposal;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getMentorId() {
		return mentorId;
	}

	public void setMentorId(Long mentorId) {
		this.mentorId = mentorId;
	}

	public Long getSkillId() {
		return skillId;
	}

	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}

	@Override
	public String toString() {
		return "UserMentorModel [Id=" + Id + ", userId=" + userId + ", mentorId=" + mentorId + ", skillId=" + skillId
				+ ", userProposal=" + userProposal + ", mentorProposal=" + mentorProposal + ", userReconfirmProposal="
				+ userReconfirmProposal + ", userRating=" + userRating + ", userProgress=" + userProgress
				+ ", feedback=" + feedback + "]";
	}

	public UserMentorModel(Long id, @NotBlank Long userId, @NotBlank Long mentorId, @NotBlank Long skillId,
			 boolean userProposal, boolean mentorProposal, boolean userReconfirmProposal,
			 double userRating, int userProgress, String feedback) {
		super();
		Id = id;
		this.userId = userId;
		this.mentorId = mentorId;
		this.skillId = skillId;
		this.userProposal = userProposal;
		this.mentorProposal = mentorProposal;
		this.userReconfirmProposal = userReconfirmProposal;
		this.userRating = userRating;
		this.userProgress = userProgress;
		this.feedback = feedback;
	}
	
	public UserMentorModel() {}
}
