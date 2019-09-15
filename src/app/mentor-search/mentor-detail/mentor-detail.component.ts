import {Component, Input, OnInit} from '@angular/core';
import {MentorModel} from "../../serviceModule/MentorModule/Mentor.Model";

@Component({
  selector: 'app-mentor-detail',
  templateUrl: './mentor-detail.component.html',
  styleUrls: ['./mentor-detail.component.css']
})
export class MentorDetailComponent implements OnInit {
@Input() mentorData:MentorModel;
  constructor() { }

  ngOnInit() {
  }

}
