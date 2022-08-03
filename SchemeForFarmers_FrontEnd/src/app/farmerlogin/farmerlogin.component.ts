import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { FarmerLoginService } from '../farmerloginservice';
import { LoginService } from '../login.service';
import { Login } from '../model/login';
@Component({
  selector: 'app-farmerlogin',
  templateUrl: './farmerlogin.component.html',
  styleUrls: ['./farmerlogin.component.css']
})
export class FarmerloginComponent {

  login: Login = new Login();
  message: string;

  constructor(private farmerloginService: FarmerLoginService, private router: Router) { }
  Submitdata() {
    
    this.farmerloginService.login(this.login).subscribe(data => {
      if(data != null)
      {
        let farmerId = data.farmerId;
        sessionStorage.setItem('farmerId', String(farmerId));
        this.router.navigate(['farmerHome']);
      }
      else{
        alert("Wrong Login");
      }
      
    })
  }



 
}




 
  