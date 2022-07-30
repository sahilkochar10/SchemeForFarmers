import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Bidder  } from "./Bidder";
import { Observable } from 'rxjs';
import { Status } from './model/status';
import { cropdto } from './crop-dto';
import { BidDto } from './bid-dto';

@Injectable({
  providedIn: 'root'
})
export class BidderService {

  constructor(private http:HttpClient) { }

  register(bidder:Bidder):Observable<Status>{
    console.log(bidder.aadharNo);
    
    let url='http://localhost:9090/register';
    return this.http.post<Status>(url,bidder);
  }
  getBidderList():Observable<any>
  {
    let url='http://localhost:9090/viewAllBidders';
    return this.http.get(url);
  }
  updateCrop(crop:BidDto):Observable<Status>
  {
    let url='http://localhost:9090/BidPlace';
    return this.http.post<Status>(url,crop);
  }
  getCropId(id:number):Observable<any>
  {
    let url = 'http://localhost:9090/Crop?cropId='+id;
    return this.http.get(url);
  }
}