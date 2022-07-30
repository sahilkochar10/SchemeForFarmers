import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Bidder } from '../Bidder';
import { BidderService } from '../bidder.service';

@Component({
  selector: 'app-bidderhome',
  templateUrl: './bidderhome.component.html',
  styleUrls: ['./bidderhome.component.css']
})
export class BidderhomeComponent implements OnInit {
  id:Number;
  constructor(private bidderService:BidderService,private router:Router) { }
  bidders:Bidder[];
  bidder:Bidder[];
  bBal :Number;
  ngOnInit(){
    this.id = Number(sessionStorage.getItem("bidderId"));
  }
  func():void
  {
    if(localStorage.getItem("bidderId")!=null){
      localStorage.removeItem("bidderID");
      this.router.navigate(['Home']);
    }
  }
  balance()
  {
    this.bidderService.getBidderList().subscribe(data=>
      {
        this.bidders = data;
        this.bidder = this.bidders.filter(
          x=> x.bidderId == this.id
        )
        this.bBal = this.bidder[0].balance;
        alert("Your Balance is:"+this.bBal);
      })
  }
}
