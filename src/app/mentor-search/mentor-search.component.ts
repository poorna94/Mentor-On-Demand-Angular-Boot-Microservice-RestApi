import { Component, OnInit } from '@angular/core';
import {MentorModel} from "../../shared/Mentor.Model";

@Component({
  selector: 'app-mentor-search',
  templateUrl: './mentor-search.component.html',
  styleUrls: ['./mentor-search.component.css']
})
export class MentorSearchComponent implements OnInit {
mentorArray: MentorModel[] = [new MentorModel(1,'deep','Java'),
                              new MentorModel(2,'Jonty','Jquery'),
                              new MentorModel(3,'Lavish','JavaScript'),
                              new MentorModel(4,'karan','Node.js')];

  constructor() { }

  ngOnInit() {
  }

}
