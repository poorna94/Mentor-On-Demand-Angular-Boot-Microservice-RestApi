package com.mod.SkillsMicroservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mod.SkillsMicroservice.Model.SkillsModel;
import com.mod.SkillsMicroservice.Service.SkillsServiceInteferface;

@CrossOrigin(origins ="http://localhost:4200")
@RestController
@RequestMapping("/skill")
public class SkillsController {
	
	@Autowired
	SkillsServiceInteferface skillServiceInterface;
	
	@PostMapping("/add")
	public ResponseEntity<SkillsModel> addSkill(@RequestBody SkillsModel skilldata) {
		return new ResponseEntity<SkillsModel>(skillServiceInterface.saveSkill(skilldata),HttpStatus.OK);
	}
	
}
