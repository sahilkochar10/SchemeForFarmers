import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { FarmerserviceService } from '../farmerservice.service';
import { User } from '../model/user';

@Component({
  selector: 'app-forgetpassword',
  templateUrl: './forgetpassword.component.html',
  styleUrls: ['./forgetpassword.component.css']
})
export class ForgetpasswordComponent implements OnInit {
  UserDoesNotExist=false;
  
  ISLoading:boolean=false;
  constructor(private service:FarmerserviceService,private route:Router){}

  fpForm=new FormGroup({
    Email:new FormControl("",[Validators.required,Validators.pattern("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")])
  })

  ngOnInit():void{

  }
  get Email(){
    return this.fpForm.get('Email');
  }
  SubmitData1(){
    this.ISLoading=true;
    this.service.CheckEmail(this.fpForm.value).subscribe((data:any)=>{
      if(data["EmailExists"]==true){
        this.UserDoesNotExist=false;
        this.route.navigateByUrl("/ForgetPassword");
        sessionStorage.setItem("ForgetEmail",this.fpForm.value["Email"])
      }
      else if(data["EmailExists"]==false){
        this.UserDoesNotExist=true;
      }
    })
  }

}



   