import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {
  
    emailid:string;
    password:string;
 
  constructor(private router:Router) { }

  ngOnInit(): void {
  }
  checkLogin(){
    console.log(this.emailid+" "+this.password);
    if(this.emailid=="deepak@gmail.com" && this.password=="deepak123"){
      sessionStorage.setItem("email",this.emailid);
      //localStorage.setItem("uname",this.username);
      this.router.navigate(['/adminHome'])
    }
    else{
      alert("Wrong Password")
      this.router.navigate(['/adminLogin'])
    }

  }

}
