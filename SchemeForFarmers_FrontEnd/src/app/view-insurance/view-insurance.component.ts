import { Component, OnInit } from '@angular/core';
import { Claim } from '../claim';
import { FarmerService } from '../farmer.service';
import { InsuranceDto } from '../insurance-dto';

@Component({
  selector: 'app-view-insurance',
  templateUrl: './view-insurance.component.html',
  styleUrls: ['./view-insurance.component.css']
})
export class ViewInsuranceComponent implements OnInit {

  insurance:InsuranceDto[];
  claim:Claim[];
  constructor(private farmerService:FarmerService) { }

  ngOnInit(){
    this.farmerService.getInsurance().subscribe(data=>
      {
        console.log(data);
        this.insurance = data;
      })
      
  }

}
