package com.mod.SkillsMicroservice.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="skill_Model")
public class SkillsModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long skillId;
	
	@NotBlank
	private Long mentorId;
	
	@NotNull
	private String skillName;

	@NotBlank
	private int skillDuration;
	
	public Long getSkillId() {
		return skillId;
	}

	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}

	public Long getMentorId() {
		return mentorId;
	}

	public void setMentorId(Long mentorId) {
		this.mentorId = mentorId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	@Override
	public String toString() {
		return "SkillsModel [skillId=" + skillId + ", mentorId=" + mentorId + ", skillName=" + skillName + "]";
	}

	public SkillsModel(Long skillId, @NotBlank Long mentorId, @NotNull String skillName) {
		super();
		this.skillId = skillId;
		this.mentorId = mentorId;
		this.skillName = skillName;
	}
	
	public SkillsModel() {}
	
}
