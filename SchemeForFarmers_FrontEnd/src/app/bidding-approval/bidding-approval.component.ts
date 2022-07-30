import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AdminService } from '../admin.service';
import { BidApproveDto } from '../bid-approve-dto';
import { FarmerService } from '../farmer.service';
import { MarketDto } from '../market-dto';

@Component({
  selector: 'app-bidding-approval',
  templateUrl: './bidding-approval.component.html',
  styleUrls: ['./bidding-approval.component.css']
})
export class BiddingApprovalComponent implements OnInit {
  crops:MarketDto[];
  div1:boolean = false;
  crop:BidApproveDto = new BidApproveDto();
  constructor(private farmerService:FarmerService,private adminService:AdminService,private router:Router) { }


  ngOnInit(){
    this.farmerService.marketPlace().subscribe(data=>
      {
        this.crops=data;
      })
  }
  approve()
  {
    this.div1=true;
  }
  approveBid()
  {
    this.adminService.updateBid(this.crop).subscribe(data=>
      {
        this.router.navigate(['adminHome']);
      })
  }
}
