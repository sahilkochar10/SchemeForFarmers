import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AdminService } from '../admin.service';
import { FarmerService } from '../farmer.service';
import { Insurance } from '../insurance';
import { InsuranceApproveDto } from '../insurance-approve-dto';
import { InsuranceDto } from '../insurance-dto';

@Component({
  selector: 'app-insurance-approval',
  templateUrl: './insurance-approval.component.html',
  styleUrls: ['./insurance-approval.component.css']
})
export class InsuranceApprovalComponent implements OnInit {
  div1=false;
  insurances:InsuranceDto[];
  insurance: InsuranceApproveDto = new InsuranceApproveDto();

  constructor(private farmerService:FarmerService,private adminService:AdminService,private router:Router) { }

  ngOnInit(){
    this.farmerService.getInsurance().subscribe(data=>
      {
        this.insurances = data;
      })
  }
  approve()
  {
    this.div1=true;
  }
  approveInsurance()
  {
    
    this.adminService.updateInsurance(this.insurance).subscribe(data=>
      {
        // if(data.status='SUCCESS')
        // {
          console.log(this.insurance.insureeId);
          this.router.navigate(['adminHome']);
        // }
      })
  }
}
