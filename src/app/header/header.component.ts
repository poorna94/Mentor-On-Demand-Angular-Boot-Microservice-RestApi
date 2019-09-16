import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {MentorService} from "../serviceModule/MentorModule/mentor.service";

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  isUserLoggedIn:string;
  isMentorLoggedIn:string;


  constructor() { }

  @Output() OnSelectingMenuOption = new EventEmitter<string>();
  ngOnInit() {
    this.isUserLoggedIn = localStorage.getItem('isUserLoggedIn');
  }

  selectedMenuOption(option:string) {
      this.OnSelectingMenuOption.emit(option);
  }
}
