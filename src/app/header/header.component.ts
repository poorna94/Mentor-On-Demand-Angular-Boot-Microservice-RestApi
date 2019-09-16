import {Component, EventEmitter, Injectable, OnChanges, OnInit, Output} from '@angular/core';
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
    console.log("again running")
  }

  selectedMenuOption(option:string) {
      this.OnSelectingMenuOption.emit(option);
  }

  getUserLogOut() {
    localStorage.removeItem('isUserLoggedIn');
    localStorage.setItem('isUserLoggedIn','false');
  }
}
