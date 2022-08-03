import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { LoginService } from '../login.service';
import { Login } from '../model/login';

@Component({
  selector: 'app-bidderlogin',
  templateUrl: './bidderlogin.component.html',
  styleUrls: ['./bidderlogin.component.css']
})
export class BidderloginComponent implements OnInit {
  login: Login = new Login();
  message: string;

  constructor(private loginService: LoginService, private router: Router) { }

  ngOnInit(): void {
  }
 
  Submitdata()
  {
    
    this.loginService.login(this.login).subscribe(data => {
      
      if(data != null) {
        let bidderId = data.bidderId;
        sessionStorage.setItem('bidderId',String(bidderId));
        
        this.router.navigate(['bidderHome']);

      }
      else {
        alert("Wrong Login!");
      }
    })

  }



}
