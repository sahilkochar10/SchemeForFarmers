import { Farmer } from "./farmer";
import { Insurance } from "./insurance";

export class ClaimApproveDto {
    claimId:Number;
	insureeId:Number;
	farmerId:Number;
	insureeName:String;
	causeofloss:String;
	dateofloss:String;
	amount:Number;
	claimapproval:boolean;
}
