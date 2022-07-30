import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { FarmerserviceService } from '../farmerservice.service';
import { User } from '../model/user';

@Component({
  selector: 'app-resetpassword',
  templateUrl: './resetpassword.component.html',
  styleUrls: ['./resetpassword.component.css']
})
export class ResetpasswordComponent implements OnInit {
user!:User;
IsOTPValid:boolean=false;
IsLoading:boolean=false;
PasswordMatch:boolean=true;
resetForm=new FormGroup({
  Password:new FormControl("",[Validators.required,Validators.pattern("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$")]),
  ConfirmPassword:new FormControl("",[Validators.required,Validators.pattern("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$")]),
  Otp:new FormControl("",[Validators.required]),

})
  constructor(public service:FarmerserviceService,public router:Router) { }

  ngOnInit(): void {
  }
  get Password()
  {
    return this.resetForm.get('Password');
  }

  
  get ConfirmPassword()
  {
    return this.resetForm.get('ConfirmPassword');
  }

  
  get Otp()
  {
    return this.resetForm.get('Otp');
  }

  Submitdata(){
  this.IsLoading=true;
  this.IsOTPValid=true;
  console.log(this.resetForm.value);

   this.resetForm.value["Email"]=sessionStorage.getItem("Forgot Email");
   console.log(this.resetForm.value);

   if(this.resetForm.value["Password"] !=this.resetForm.value["ConfirmPassword"]){
     this.PasswordMatch=false;
     this.IsLoading=false;
   }
   this.service.ForgetPassword(this.resetForm.value).subscribe((data:any)=>{
     console.log(data);
     if(data["IsOTPValid"]==true){
       this.IsOTPValid=true;
       this.IsLoading=false;
       this.router.navigateByUrl("/Home")
     }
     else if(data["IsOTPValid"]==false){
       this.IsOTPValid=false;
       this.IsLoading=false;
     }
   }
   )

}








}
