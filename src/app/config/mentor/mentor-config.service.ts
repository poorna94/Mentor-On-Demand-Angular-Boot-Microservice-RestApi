import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MentorConfigService {

  private mentor_api_url = "http://localhost:8000/mentor";
  constructor() { }
}
