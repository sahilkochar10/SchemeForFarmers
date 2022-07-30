import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Crop } from '../crop';
import { cropdto } from '../crop-dto';
import { FarmerService } from '../farmer.service';

@Component({
  selector: 'app-sell-crop',
  templateUrl: './sell-crop.component.html',
  styleUrls: ['./sell-crop.component.css']
})
export class SellCropComponent implements OnInit {

message: string;
crop: Crop = new Crop();
id:Number;
constructor(private farmerService: FarmerService, private router: Router) {
}
ngOnInit(): void {
  
}
register() {
  // this.cropdto.farmerid = Number(sessionStorage.getItem('farmerId')); 
  // console.log(JSON.stringify(this.cropdto));
  // this.farmerService.sellCrop(this.cropdto).subscribe(data => {
  // console.log(JSON.stringify(data));
  // console.log(data.status);
  // if (data.status == 'SUCCESS') {
  //       this.router.navigate(['Home'])
  //     }
  //     else {
  //         alert("FAIL");
  //       //alert(data.status);
  //     }
  //   })
  // }
  this.id = Number(sessionStorage.getItem("farmerId"));
  this.crop.farmerId = this.id;
  this.farmerService.sellCrop(this.crop).subscribe(data=>
    {
      
      console.log(this.crop.farmerId);
      if(data.status == 'SUCCESS'){
        console.log(this.crop.farmerId);
        this.router.navigate(['farmerHome'])
      }
      else
      {
        alert(data.status);
      }
    })
  }
}