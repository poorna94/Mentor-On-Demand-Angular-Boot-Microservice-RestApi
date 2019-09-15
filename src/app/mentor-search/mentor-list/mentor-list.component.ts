import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {MentorModel} from "../../serviceModule/MentorModule/Mentor.Model";

@Component({
  selector: 'app-mentor-list',
  templateUrl: './mentor-list.component.html',
  styleUrls: ['./mentor-list.component.css']
})
export class MentorListComponent implements OnInit {
  mentorArray: MentorModel[] = [new MentorModel(1,'deep','Java',24,4.5),
    new MentorModel(2,'Jonty','Jquery',30,4.0),
    new MentorModel(3,'Lavish','JavaScript',10,3.9),
    new MentorModel(4,'karan','Node.js',50,4.9),
    new MentorModel(4,'karan','Node.js',50,4.9),
    new MentorModel(4,'karan','Node.js',50,4.9),
    new MentorModel(4,'karan','Node.js',50,4.9),
    new MentorModel(4,'karan','Node.js',50,4.9),
    new MentorModel(4,'karan','Node.js',50,4.9),
    new MentorModel(4,'karan','Node.js',50,4.9),
    new MentorModel(4,'karan','Node.js',50,4.9),
    new MentorModel(4,'karan','Node.js',50,4.9),
    new MentorModel(4,'karan','Node.js',50,4.9),
    new MentorModel(4,'karan','Node.js',50,4.9)];

  @Input() mentorData:MentorModel;
  constructor() { }

  ngOnInit() {
  }

  @Output() onSelectingMentor = new EventEmitter<MentorModel>();

  mentorElaborate(mentor: MentorModel) {
    this.onSelectingMentor.emit(mentor);
  }
}
