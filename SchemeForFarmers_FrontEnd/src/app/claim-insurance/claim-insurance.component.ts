import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { ClaimDto } from '../claim-dto';
import { FarmerService } from '../farmer.service';
import { InsuranceDto } from '../insurance-dto';


@Component({
  selector: 'app-claim-insurance',
  templateUrl: './claim-insurance.component.html',
  styleUrls: ['./claim-insurance.component.css']
})
export class ClaimInsuranceComponent implements OnInit {

  insurance:ClaimDto = new ClaimDto();
  insurances:InsuranceDto[];
  div1 = false;
  constructor(private farmerService:FarmerService,private router:Router) { }

  ngOnInit(){
    this.farmerService.getInsurance().subscribe(data=>
      {
        this.insurances = data;
      })
  }
  claim()
  {
    this.div1=true;
  }
  Submitdata()
  {
    this.farmerService.claimInsurance(this.insurance).subscribe(data=>
      {
        if(data.status == 'SUCCESS')
        {
          this.router.navigate(['farmerHome']);
        }
      })
  }
}
