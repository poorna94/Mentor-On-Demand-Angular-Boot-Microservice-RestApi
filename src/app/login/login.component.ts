import { Component, OnInit } from '@angular/core';
import {NgForm} from "@angular/forms";
import {UserService} from "../serviceModule/UserModule/user.service";
import {UserModel} from "../serviceModule/UserModule/user.model";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  private loggerInUser:UserModel;
  constructor(private userService :UserService) { }

  ngOnInit() {
  }

  onSubmit(userLoginForm: NgForm) {
        this.userService.loginUser(userLoginForm.value)
          .subscribe((data)=>{
              console.log("User logged in");
              this.loggerInUser = data;
          },
            (error)=> {
              console.log("User not found")
          });
  }
}
