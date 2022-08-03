import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';
import { HistoryDto } from '../history-dto';

@Component({
  selector: 'app-bidhistory',
  templateUrl: './bidhistory.component.html',
  styleUrls: ['./bidhistory.component.css']
})
export class BidhistoryComponent implements OnInit {
  crop:HistoryDto[];
  crops:HistoryDto[];
  constructor(private adminService:AdminService) { }
  b_id:Number;
  ngOnInit(){
    this.b_id = Number(sessionStorage.getItem("bidderId"))
    this.adminService.history().subscribe(data =>
      {
            this.crop = data;
            
            this.crops = this.crop.filter(
              x=> x.bidder.bidderId == this.b_id
            );
            console.log(this.b_id);
            
      })
  }

}
