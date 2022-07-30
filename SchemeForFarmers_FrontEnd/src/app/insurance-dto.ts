import { Claim } from "./claim";
import { Farmer } from "./farmer";

export class InsuranceDto {
    insuranceId: Number;
    insureeName: String;
    cropName:String;
    croptype: String;
    sumInsured:Number;
    area: Number;
    estimatedamount:Number;
    approvedstatus:boolean;
    farmer:Farmer;
    claim:Claim;
}
