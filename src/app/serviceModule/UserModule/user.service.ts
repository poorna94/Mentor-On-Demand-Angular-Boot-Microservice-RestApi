import {Injectable} from '@angular/core';
import {UserModel} from "./user.model";
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";
import {map} from "rxjs/operators";
import {UserConfigService} from "../../config/user/user-config.service";

const httpOptions={
  headers: new HttpHeaders({
    'Content-Type':'application/json'
  })
};

@Injectable({
  providedIn: 'root'
})
export class UserService {
  constructor( private  http : HttpClient,
               private userConfig : UserConfigService) { }


  private static extractData(res: Response){
    return res || { };
  }

  createUser(userData:UserModel):Observable<UserModel>{
    return this.http.post<UserModel>(this.userConfig.getUserLoginURL(),userData,httpOptions);
  }

  loginUser(user):Observable<UserModel>{
    const loginHeaders = new HttpHeaders({
      'Accept': 'application/json',
      'Content-Type': 'application/x-www-form-urlencoded'
    });
    // @ts-ignore
    return this.http.get<UserModel>(this.userConfig.getUserLoginURL(),loginHeaders);
  }
}
