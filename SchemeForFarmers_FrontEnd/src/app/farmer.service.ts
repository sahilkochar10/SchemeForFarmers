import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Farmer } from './farmer';
import { Observable } from 'rxjs';
import { cropdto } from './crop-dto';
import { MarketDto } from './market-dto';
import { Crop } from './crop';
// import { cropdto } from './cropdto';
import { Status } from './model/status';
import { Insurance } from './insurance';
import { ClaimInsurance } from './claim-insurance';
import { InsuranceDto } from './insurance-dto';
import { ClaimDto } from './claim-dto';
import { Claim } from './claim';
import { Claimins } from './claimins';
@Injectable({
  providedIn: 'root'
})
export class FarmerService {

  constructor(private http:HttpClient) { }

  register(farmer:Farmer):Observable<Status>{
    console.log(farmer.aadharNo);
    
    let url='http://localhost:9090/registerFarmer';
    return this.http.post<Status>(url,farmer);
  }
  getFarmerList():Observable<Farmer[]>
  {
    let url='http://localhost:9090/viewAllFarmer';
    return this.http.get<Farmer[]>(url);
  }
  sellCrop(crop:Crop):Observable<Status>{
    console.log("Sent");
    
    let url='http://localhost:9090/placeSellRequest';
    return this.http.post<Status>(url,crop);
    
  }
  marketPlace():Observable<MarketDto[]>
  {
    let url='http://localhost:9090/marketPlace';
    return this.http.get<MarketDto[]>(url);
  }
  applyInsurance(insurance:Insurance):Observable<Status>{
    console.log("Sent");
    
    let url='http://localhost:9090/applyInsurance';
    return this.http.post<Status>(url,insurance);
    
  }

  claimInsurance(insurance:ClaimDto):Observable<Status>{
    console.log("Sent");
    
    let url='http://localhost:9090/claimInsurance';
    return this.http.post<Status>(url,insurance);
    
  }
  getInsurance():Observable<InsuranceDto[]>
  {
    let url ='http://localhost:9090/viewAllInsurance';
    return this.http.get<InsuranceDto[]>(url);
  }
  getClaim():Observable<Claimins[]>
  {
    let url = 'http://localhost:9090/viewAllClaim';
    return this.http.get<Claimins[]>(url);
  }
}
