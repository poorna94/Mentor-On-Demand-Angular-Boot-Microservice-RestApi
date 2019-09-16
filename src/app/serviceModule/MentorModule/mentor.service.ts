import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {MentorModel} from "./Mentor.Model";
import {MentorConfigService} from "../../config/mentor/mentor-config.service";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class MentorService {

  constructor(private http: HttpClient,
              private mentorConfig:MentorConfigService) { }
  getAllMentors():Observable<MentorModel[]>{
    // @ts-ignore
    return this.http.get<MentorModel>(this.mentorConfig.getAllMentors_API_URL());
  }

  // @ts-ignore
  getMentorLogin(mentorData:MentorModel):Observable<MentorModel>{
      this.http.post<MentorModel>(this.mentorConfig.getMentorLogIn(),mentorData);
  }

  getMentorRegistered(mentorData:MentorModel):Observable<MentorModel>{
    // @ts-ignore
    return this.http.post<MentorModel>(this.mentorConfig.getMentorRegistered_API_URL(),mentorData).pipe();
  }
}
