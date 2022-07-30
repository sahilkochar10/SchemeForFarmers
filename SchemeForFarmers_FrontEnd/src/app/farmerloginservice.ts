import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Observable } from 'rxjs';

import { Login } from './model/login';
import { LoginStatus } from './model/login-status';
import { Farmer } from './farmer';

@Injectable({
  providedIn: 'root'
})
export class FarmerLoginService {

  constructor(private http: HttpClient) { }

  login(login: Login) : Observable<Farmer>  {
    let url = 'http://localhost:9090/FarmerLogin';
    return this.http.post<Farmer>(url, login);

  }
}
