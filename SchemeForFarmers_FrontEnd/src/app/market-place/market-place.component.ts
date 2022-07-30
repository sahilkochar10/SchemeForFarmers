import { Component, OnInit } from '@angular/core';
import { FarmerService } from '../farmer.service';
import { MarketDto } from '../market-dto';

@Component({
  selector: 'app-market-place',
  templateUrl: './market-place.component.html',
  styleUrls: ['./market-place.component.css']
})
export class MarketPlaceComponent implements OnInit {
  crops:MarketDto[];
  constructor(private farmerService:FarmerService) { }

  ngOnInit(){
    this.farmerService.marketPlace().subscribe(data=>
      {
        this.crops=data;
        console.log(JSON.stringify(this.crops))
      })
  }

}
