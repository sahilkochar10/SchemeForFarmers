import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BidderDetailsComponent } from './bidder-details/bidder-details.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { FarmerDetailsComponent } from './farmer-details/farmer-details.component';
import { InsuranceApprovalComponent } from './insurance-approval/insurance-approval.component';
import { InsuranceclaimComponent } from './insuranceclaim/insuranceclaim.component';
import { MarketPlaceComponent } from './market-place/market-place.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { BidderRegComponent } from './bidder-reg/bidder-reg.component';
import { BidderloginComponent } from './bidderlogin/bidderlogin.component';
import { FarmerRegComponent } from './farmer-reg/farmer-reg.component';
import { FarmerloginComponent } from './farmerlogin/farmerlogin.component';
import { ForgetpasswordComponent } from './forgetpassword/forgetpassword.component';
import { Forgetpassword1Component } from './forgetpassword1/forgetpassword1.component';
import { HomeComponent } from './home/home.component';
import { BiddingApprovalComponent } from './bidding-approval/bidding-approval.component';
import { BidderhomeComponent } from './bidderhome/bidderhome.component';
import { BidPlacingComponent } from './bid-placing/bid-placing.component';
import { BidhistoryComponent } from './bidhistory/bidhistory.component';
import { ApplyInsuranceComponent } from './apply-insurance/apply-insurance.component';
import { ClaimInsuranceComponent } from './claim-insurance/claim-insurance.component';
import { ViewInsuranceComponent } from './view-insurance/view-insurance.component';
import { AdminComponent } from './admin/admin.component';
import { FarmerhomeComponent } from './farmerhome/farmerhome.component';
import { SellCropComponent } from './sell-crop/sell-crop.component';
import { SoldHistoryComponent } from './sold-history/sold-history.component';
import { InsuranceDashboardComponent } from './insurance-dashboard/insurance-dashboard.component';
const routes: Routes = [
  // {
  //   path:'',
  //   component: DashboardComponent
  // },
  {
    path:'marketPlaceLink',
    component:MarketPlaceComponent
  },
  {
    path:'adminHome',
    component:AdminComponent,
    children:
    [
      // {
      //   path:'',
      //   component: DashboardComponent
      // },
      // {
      //   path:'dashBoardLink',
      //   component: DashboardComponent
      // },
      {
        path:'farmerLink',
        component:FarmerDetailsComponent
      },
      {
        path:'bidderLink',
        component:BidderDetailsComponent
      },
      {
        path:'biddingApproval',
        component:BiddingApprovalComponent
      },
      {
        path:'insuranceApprovalLink',
        component:InsuranceApprovalComponent
      },
      {
        path:'claimApprovalLink',
        component: InsuranceclaimComponent
      }
      
    ]
  },

  {
    path:'bidderHome',
    component:BidderhomeComponent,
    children:
    [
      {
        path:'placebid',
        component:BidPlacingComponent
      },
      {
        path:'biddingHistory',
        component:BidhistoryComponent
        
      },
      {
        path:'marketplace',
        component:MarketPlaceComponent
      }    
    ]
  },
  {
    path:'farmerHome',
    component:FarmerhomeComponent,
    children:
    [
      {
        path:'sellCrop',
        component: SellCropComponent
      },
      {
        path:'soldHistory',
        component:SoldHistoryComponent
      },
      {
          path:'marketplace',
          component:MarketPlaceComponent
      },
      {
        path:'insuranceDashboard',
        component:InsuranceDashboardComponent,
        // children:
        // [
        //   {path:'ApplyInsurance',component:ApplyInsuranceComponent},
        //   {path:'ClaimInsurance',component:ClaimInsuranceComponent},
        //   {path:'ViewInsurance',component:ViewInsuranceComponent}
        // ]
      },
      {path:'ApplyInsurance',component:ApplyInsuranceComponent},
      {path:'ClaimInsurance',component:ClaimInsuranceComponent},
      {path:'ViewInsurance',component:ViewInsuranceComponent}
      
    ]
  },
  {path:'',component:HomeComponent},
  {path:'Home', component:HomeComponent},
  {path:'AdminLogin',component:AdminloginComponent},
  {path:'FarmerLogin',component:FarmerloginComponent},
  {path:'BidderLogin',component:BidderloginComponent},
  {path:'ForgetPassword',component:ForgetpasswordComponent},
  {path:'ForgetPassword',component:ForgetpasswordComponent},

  {path:'ForgetPassword1',component:Forgetpassword1Component},

  {path:'ApplyInsurance',component:ApplyInsuranceComponent},
  {path:'ClaimInsurance',component:ClaimInsuranceComponent},
  {path:'ViewInsurance',component:ViewInsuranceComponent},
  {path:'FarmerRegistration',component:FarmerRegComponent},
  {path:'BidderRegistration',component:BidderRegComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
