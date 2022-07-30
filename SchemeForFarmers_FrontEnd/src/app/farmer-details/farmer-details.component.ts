import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Farmer } from '../farmer';
import { FarmerService } from '../farmer.service';

@Component({
  selector: 'app-farmer-details',
  templateUrl: './farmer-details.component.html',
  styleUrls: ['./farmer-details.component.css']
})
export class FarmerDetailsComponent implements OnInit {

  constructor(private farmerService:FarmerService) { }
  // farmers:Observable<Farmer[]>;
  farmers:Farmer[];
  
  ngOnInit()
  {
  //   this.farmers=
  // [
  //   {
  //     farmerId:1001,farmerFirstName:'John',farmerLastName:'S',email:"john@gmail.com",password:"john123",contactNo:"9123456789",balance:10000,aadharNo:123,landArea:"chennai"
  //   }
  // ];
    this.farmerService.getFarmerList().subscribe(data=>
      {
        
        this.farmers=data;
        console.log(JSON.stringify(this.farmers));
      })
  }
  
}

