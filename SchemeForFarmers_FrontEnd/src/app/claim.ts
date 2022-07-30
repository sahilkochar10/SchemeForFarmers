import { Farmer } from "./farmer";
import { Insurance } from "./insurance";
import { InsuranceDto } from "./insurance-dto";

export class Claim {
    claimId:Number;	
	insuranceId:Number;
	insureeName:String;
	causeofloss:String;
	dateofloss:String;
	amount:Number;
	claimapproval:boolean;
    ins:InsuranceDto;
    farmer:Farmer;
}
