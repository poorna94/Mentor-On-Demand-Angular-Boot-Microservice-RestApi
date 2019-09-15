package com.mod.SkillsMicroservice.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="skill_Model")
public class SkillsModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long skillId;
	
	@NotNull
	private String skillName;
	
}
