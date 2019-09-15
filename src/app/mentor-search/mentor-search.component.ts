import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {MentorModel} from "../serviceModule/MentorModule/Mentor.Model";

@Component({
  selector: 'app-mentor-search',
  templateUrl: './mentor-search.component.html',
  styleUrls: ['./mentor-search.component.css']
})
export class MentorSearchComponent implements OnInit {
mentorData:MentorModel;

  constructor() { }

  ngOnInit() {
  }
  selectedMentorDetail(mentorData: MentorModel) {
    this.mentorData=mentorData;
  }
}
