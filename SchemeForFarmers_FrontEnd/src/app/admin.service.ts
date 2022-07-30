import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { BidApproveDto } from './bid-approve-dto';
import { ClaimApproveDto } from './claim-approve-dto';
import { HistoryDto } from './history-dto';
import { Insurance } from './insurance';
import { Status } from './model/status';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  constructor(private http:HttpClient) { }
  updateBid(bid:BidApproveDto):Observable<Status>
  {
    let url = 'http://localhost:9090/BiddingApproval';
    return this.http.post<Status>(url,bid);
  }
  history():Observable<HistoryDto[]>
  {
    let url = 'http://localhost:9090/History';
    return this.http.get<HistoryDto[]>(url);
  }
  updateInsurance(insurance:Insurance):Observable<Status>
  {
    let url = 'http://localhost:9090/insuranceApproval';
    return this.http.post<Status>(url,insurance);
  }
  updateClaim(insurance:ClaimApproveDto):Observable<Status>
  {
    let url = 'http://localhost:9090/claimApprove';
    return this.http.post<Status>(url,insurance);
  }
}
