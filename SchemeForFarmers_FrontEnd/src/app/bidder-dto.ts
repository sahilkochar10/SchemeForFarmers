class BidderDto {
    bidderId:number;
    bidderFirstName:String;
    bidderLastName:String;
    email:String;
    // password:String;
    contactNo: String;
    // balance: String;
    // aadharNo:number;
    // traderLicenseNo: number;
    constructor(bidderId:number,bidderFirstName:String,bidderLastName:String,email:String,contactNo: String,)
    {
        this.bidderId=bidderId;
        this.bidderFirstName=bidderFirstName;
        this.bidderLastName=bidderLastName;
        this.email=email;
        this.contactNo=contactNo;
    }
}
