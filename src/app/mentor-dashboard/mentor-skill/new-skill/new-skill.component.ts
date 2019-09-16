import { Component, OnInit } from '@angular/core';
import {NgForm} from "@angular/forms";

@Component({
  selector: 'app-new-skill',
  templateUrl: './new-skill.component.html',
  styleUrls: ['./new-skill.component.css']
})
export class NewSkillComponent implements OnInit {
materialOptions = ['Notes Material','Live video session','Doubt session','Video Study Material'];
  constructor() { }

  ngOnInit() {
  }

  onSubmit(f: NgForm) {

  }
}
