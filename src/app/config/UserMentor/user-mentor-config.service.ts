import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserMentorConfigService {

  private API_URL = "http://localhost:8004/exchange";

  getProposalByStudentSaved_URL():string{
    return (this.API_URL+"/add");
  }
  constructor() { }
}
