import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable, Subject } from 'rxjs';
import { Bidder } from '../Bidder';
import { BidderService } from '../bidder.service';

@Component({
  selector: 'app-bidder-details',
  templateUrl: './bidder-details.component.html',
  styleUrls: ['./bidder-details.component.css']
})
export class BidderDetailsComponent implements OnInit {

  constructor(private bidderService:BidderService,router:Router) { }
  // bidderArray:any[];
  // dtTrigger:Subject<any> = new Subject();
  bidders:Observable<Bidder[]>;
  // bidders:BidderDto[];
  // bidderDetails:Observable<Bidder[]>;
  ngOnInit() {
    this.bidderService.getBidderList().subscribe(data=>
      {
        this.bidders=data;
        // this.bidderDetails=this.bidders;
        // // this.dtTrigger.next();
        console.log(this.bidders);
        // console.log(this.bidderDetails);
      })  

  }

  }
