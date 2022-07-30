import { Injectable } from '@angular/core';
import {HttpClient,HttpHeaders} from '@angular/common/http'
import { User } from './model/user';

@Injectable({
  providedIn: 'root'
})
export class FarmerserviceService {

  constructor(private client:HttpClient) { }
  private url="#"
  httpOptions={
    headers:new HttpHeaders({'Content-Type':'application/json'})
  }

  CheckEmail(users:User){
    return this.client.post(this.url+'Users/EmailExists',JSON.stringify(users),this.httpOptions);
  }

  ForgetPassword(users:User){
    return this.client.post(this.url+"/ForgetPassword",JSON.stringify(users),this.httpOptions);
  }

}
