import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Observable } from 'rxjs';

import { Login } from './model/login';
import { LoginStatus } from './model/login-status';
import { Bidder } from './Bidder';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http: HttpClient) { }

  login(login: Login) : Observable<Bidder>  {
    let url = 'http://localhost:9090/BidderLogin';
    return this.http.post<Bidder>(url, login);
  }
}
