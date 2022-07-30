import { Farmer } from "./farmer";
import { Insurance } from "./insurance";

export class Claimins {
    claimId:Number;
    insureeName:String;
    causeofloss:String;
    dateofloss:String;
    amount:Number;
    claimapproval:boolean;
    insurance:Insurance;
    farmer:Farmer;

}
