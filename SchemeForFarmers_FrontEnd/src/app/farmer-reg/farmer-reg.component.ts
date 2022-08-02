import { Component, Inject, Injectable, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Farmer } from '../farmer';
import { FarmerService } from "../farmer.service";
import { first } from 'rxjs/operators';

@Component({
  selector: 'app-farmer-reg',
  templateUrl: './farmer-reg.component.html',
  styleUrls: ['./farmer-reg.component.css']
})

@Injectable()
export class FarmerRegComponent  {
farmer=new Farmer();

constructor(private farmerService:FarmerService,private router:Router) {}
ngOnInit(){
}

register()
{
  //alert(JSON.stringify(this.customer));
  this.farmerService.register(this.farmer).subscribe(
    data => {

    if(data.status == 'SUCCESS') {
      alert("You've been registerd");
      this.router.navigate(['/farmerlogin'])
    }
    else {
      alert(data.status);
    }
    });
}
}
