import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SkillConfigService {
  private API_URL = "http://localhost:8003/skill";

  getSkillAdded():string{
    return this.API_URL+"/add";
  }
  constructor() { }
}
