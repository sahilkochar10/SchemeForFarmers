import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';
import{BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';


import { HomeComponent } from './home/home.component';
import { FarmerDetailsComponent } from './farmer-details/farmer-details.component';
import { BidderDetailsComponent } from './bidder-details/bidder-details.component';
import { MarketPlaceComponent } from './market-place/market-place.component';
import { InsuranceApprovalComponent } from './insurance-approval/insurance-approval.component';
import { InsuranceclaimComponent } from './insuranceclaim/insuranceclaim.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { FarmerloginComponent } from './farmerlogin/farmerlogin.component';
import { BidderloginComponent } from './bidderlogin/bidderlogin.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ForgetpasswordComponent } from './forgetpassword/forgetpassword.component';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatMenuModule } from '@angular/material/menu';
import { MatIconModule } from '@angular/material/icon';
import { MatDividerModule } from '@angular/material/divider';
import { MatListModule } from '@angular/material/list';
import { BiddingApprovalComponent } from './bidding-approval/bidding-approval.component';
import { BidderhomeComponent } from './bidderhome/bidderhome.component';
import { BidPlacingComponent } from './bid-placing/bid-placing.component';
import { BidhistoryComponent } from './bidhistory/bidhistory.component';

import { ResetpasswordComponent } from './resetpassword/resetpassword.component';
import { Resetpassword1Component } from './resetpassword1/resetpassword1.component';
import { Forgetpassword1Component } from './forgetpassword1/forgetpassword1.component';
import { FarmersloginComponent } from './farmerslogin/farmerslogin.component';
import { ApplyInsuranceComponent } from './apply-insurance/apply-insurance.component';
import { ClaimInsuranceComponent } from './claim-insurance/claim-insurance.component';
import { ViewInsuranceComponent } from './view-insurance/view-insurance.component';
import { BidderRegComponent } from './bidder-reg/bidder-reg.component';
import { FarmerRegComponent } from './farmer-reg/farmer-reg.component';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { SellCropComponent } from './sell-crop/sell-crop.component';
import { FarmerhomeComponent } from './farmerhome/farmerhome.component';
import { SoldHistoryComponent } from './sold-history/sold-history.component';
import { InsuranceDashboardComponent } from './insurance-dashboard/insurance-dashboard.component';
import { AdminComponent } from './admin/admin.component';
import { ViewClaimComponent } from './view-claim/view-claim.component';



@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    HomeComponent,
    FarmerDetailsComponent,
    BidderDetailsComponent,
    MarketPlaceComponent,
    InsuranceApprovalComponent,
    InsuranceclaimComponent,
    DashboardComponent,
    HomeComponent,
    FarmerloginComponent,
    BidderloginComponent,
    AdminloginComponent,
    ForgetpasswordComponent,
    BiddingApprovalComponent,
    BidderhomeComponent,
    BidPlacingComponent,
    BidhistoryComponent,
    FarmerloginComponent,
      BidderloginComponent,
      AdminloginComponent,
      ForgetpasswordComponent,

      ResetpasswordComponent,
      Resetpassword1Component,
      Forgetpassword1Component,
      FarmersloginComponent,
    

      ApplyInsuranceComponent,
      ClaimInsuranceComponent,
      ViewInsuranceComponent,

      BidderRegComponent,
      FarmerRegComponent,
      SellCropComponent,
      FarmerhomeComponent,
      SoldHistoryComponent,
      InsuranceDashboardComponent,
      ViewClaimComponent,
 

      
  ],
  imports: [
    BrowserModule,    
    AppRoutingModule,
    ReactiveFormsModule,
    // MatSidenavModule,
    // MatToolbarModule,
    // MatMenuModule,
    // MatIconModule,
    // MatDividerModule,
    // MatListModule,
    FormsModule,

  
    ReactiveFormsModule,
    HttpClientModule,
    // MatFormFieldModule,
    // MatInputModule,
    BrowserAnimationsModule
    
  ],
  exports:[FormsModule,
    ReactiveFormsModule,
  //   MatFormFieldModule,
  //   MatInputModule,
  //  BrowserAnimationsModule
    MatFormFieldModule,
    MatInputModule,
   BrowserAnimationsModule

  ],
  
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

