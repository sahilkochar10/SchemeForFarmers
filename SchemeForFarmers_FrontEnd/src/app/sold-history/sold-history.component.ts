import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';
import { HistoryDto } from '../history-dto';

@Component({
  selector: 'app-sold-history',
  templateUrl: './sold-history.component.html',
  styleUrls: ['./sold-history.component.css']
})
export class SoldHistoryComponent implements OnInit {
  crop:HistoryDto[];
  crops:HistoryDto[];
  constructor(private adminService:AdminService) { }
  f_id:Number
  ngOnInit() {
    this.f_id = Number(sessionStorage.getItem("farmerId"));
    this.adminService.history().subscribe(data=>
      {
        this.crop = data;
        this.crops = this.crop.filter(
          x=> x.farmer.farmerId == this.f_id
        );
      }
    )
  }

}
