import {Component, EventEmitter, Injectable, OnChanges, OnInit, Output} from '@angular/core';
import {MentorService} from "../serviceModule/MentorModule/mentor.service";

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})

export class HeaderComponent implements OnInit, OnChanges {
  isUserLoggedIn:string = "no";
  isMentorLoggedIn:string = "no";


  constructor() { }

  @Output() OnSelectingMenuOption = new EventEmitter<string>();
  ngOnInit() {
    this.isUserLoggedIn = localStorage.getItem('isUserLoggedIn');
    this.isMentorLoggedIn = localStorage.getItem('isMentorLoggedIn');
    console.log("again running");
    console.log(this.isUserLoggedIn+this.isMentorLoggedIn);
  }

  ngOnChanges(){
    this.isUserLoggedIn = localStorage.getItem('isUserLoggedIn');
    this.isMentorLoggedIn = localStorage.getItem('isMentorLoggedIn');
    console.log("changes inside running");
    console.log(this.isUserLoggedIn+this.isMentorLoggedIn);
  }

  selectedMenuOption(option:string) {
      this.OnSelectingMenuOption.emit(option);
  }

  getUserLogOut() {
    localStorage.removeItem('isUserLoggedIn');
    localStorage.setItem('isUserLoggedIn','false');
  }
}
