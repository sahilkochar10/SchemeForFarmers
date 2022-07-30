import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FarmerService } from '../farmer.service';
import { Insurance } from '../insurance';

@Component({
  selector: 'app-apply-insurance',
  templateUrl: './apply-insurance.component.html',
  styleUrls: ['./apply-insurance.component.css']})

export class ApplyInsuranceComponent implements OnInit {

  message: string;
  insurance: Insurance = new Insurance();
  id:Number;
  amount:Number;
  sum:any;
  constructor(private farmerService: FarmerService, private router: Router) { }
  calculation()
  {
    if(this.insurance.croptype == "Rabi")
    {
      this.sum=this.insurance.sumInsured;
      this.amount = this.sum  * 0.2; 
    }
    else if(this.insurance.croptype == "Kharif")
    {
      this.sum=this.insurance.sumInsured;
      this.amount = this.sum  * 0.15; 
    }
    else 
    {
      this.sum=this.insurance.sumInsured;
      this.amount = this.sum  * 0.1; 
    }
    alert(this.amount+"- to be paid annually")
  }
  Submitdata()
  {
    // this.id = Number(sessionStorage.getItem("farmerId"));
    // this.insurance.insuranceId = this.id;
    // this.farmerService.applyInsurance(this.insurance).subscribe(data=>
    //   {
        
    //     console.log(this.insurance.insuranceId);
    //     if(data.status == 'SUCCESS'){
    //       console.log(this.insurance.insuranceId);
    //       //this.router.navigate(['farmerHome'])
    //     }
    //     else
    //     {
    //       alert(data.status);
    //     }
    //   })
    this.id = Number(sessionStorage.getItem("farmerId"));
    this.insurance.farmerId = this.id;
    this.insurance.estimatedamount = this.amount;
    //this.insurance.estimatedamount =
    this.farmerService.applyInsurance(this.insurance).subscribe(data=>
      {
        console.log(this.insurance);
        if(data.status == 'SUCCESS')
        {
          this.router.navigate(['farmerHome']);
        }
        else
          alert(data.status);
      }) 
  }

  ngOnInit(): void {
  }

}
