import { Component, OnInit } from '@angular/core';
import {NgForm} from "@angular/forms";
import {UserService} from "../serviceModule/UserModule/user.service";
import {UserModel} from "../serviceModule/UserModule/user.model";
import {ActivatedRoute, Router, Routes} from "@angular/router";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  private loggerInUser:UserModel;
  private isUserLoggedIn:boolean = false;


  constructor(private userService :UserService,
              private router : Router) { }

  ngOnInit() {
  }

  onSubmit(userLoginForm: NgForm) {
        this.userService.loginUser(userLoginForm.value)
          .subscribe((data)=>{
              this.loggerInUser = data;
              this.isUserLoggedIn=true;
              console.log(this.loggerInUser.userName);
              this.router.navigate(["userpage"])
                .then(r => console.log("Towards user page"));
          },
            (error)=> {
              console.log(error)
          });
  }
}
