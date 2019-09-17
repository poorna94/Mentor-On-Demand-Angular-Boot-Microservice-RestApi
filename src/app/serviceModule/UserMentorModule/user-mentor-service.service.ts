import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {UserMentorConfigService} from "../../config/UserMentor/user-mentor-config.service";
import {UserMentorModel} from "./UserMentor.Model";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class UserMentorServiceService {
  constructor(private http:HttpClient,
              private userMentorConfig:UserMentorConfigService)
  { }

  // @ts-ignore
  getProposalByStudentSent(proposalByStudent:UserMentorModel):Observable<UserMentorModel>{
    return this.http.post<UserMentorModel>(this.userMentorConfig.getProposalByStudentSaved_URL(),proposalByStudent);
  }



}
