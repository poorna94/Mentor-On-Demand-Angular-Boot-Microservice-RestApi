import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { AboutComponent } from './about/about.component';
import { MentorSearchComponent } from './mentor-search/mentor-search.component';
import { MentorDetailComponent } from './mentor-search/mentor-detail/mentor-detail.component';
import {Router, RouterModule, Routes} from "@angular/router";
import {FormsModule} from "@angular/forms";
import {HttpClient, HttpClientModule} from "@angular/common/http";
import { MentorSignUpComponent } from './mentor-sign-up/mentor-sign-up.component';
import { DropDownDirectiveDirective } from './Direcitves/DropDown/drop-down-directive.directive';
import { MentorLoginComponent } from './mentor-login/mentor-login.component';

const routes: Routes = [
  { path : '' , component : HomeComponent},
  { path : 'mentor' , component : MentorSearchComponent},
  { path : 'login' , component : LoginComponent},
  { path : 'mentorLogin' , component : MentorLoginComponent},
  { path : 'about' , component : AboutComponent},
  { path : 'loginSignUp' , component : SignUpComponent},
  { path : 'mentorSignUp' , component : MentorSignUpComponent}
];
// @ts-ignore
@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    LoginComponent,
    SignUpComponent,
    AboutComponent,
    MentorSearchComponent,
    MentorDetailComponent,
    MentorSignUpComponent,
    DropDownDirectiveDirective,
    MentorLoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(routes),
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
