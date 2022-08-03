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
  
  farmers:Farmer[];
  
  ngOnInit()
  {
  
    this.farmerService.getFarmerList().subscribe(data=>
      {
        
        this.farmers=data;
        console.log(JSON.stringify(this.farmers));
      })
  }
  
}

