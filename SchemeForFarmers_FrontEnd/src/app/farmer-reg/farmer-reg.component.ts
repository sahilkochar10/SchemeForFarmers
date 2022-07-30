import { Component, Inject, Injectable, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Farmer } from '../farmer';
import { FarmerService } from "../farmer.service";

@Component({
  selector: 'app-farmer-reg',
  templateUrl: './farmer-reg.component.html',
  styleUrls: ['./farmer-reg.component.css']
})

@Injectable()
export class FarmerRegComponent implements OnInit {
farmer=new Farmer();
constructor(private farmerService:FarmerService,private router:Router) { }
ngOnInit(): void {
}

register()
{
  //alert(JSON.stringify(this.customer));
  this.farmerService.register(this.farmer).subscribe(data => {
    //alert(JSON.stringify(data));
    if(data.status == 'SUCCESS') {
      this.router.navigate(['FarmerLogin'])
    }
    else {
      //missing code right now
      alert(data.status);
    }
  })
}
}
