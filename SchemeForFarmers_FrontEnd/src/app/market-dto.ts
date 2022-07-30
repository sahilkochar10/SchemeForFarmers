import { Bidder } from "./Bidder";
import { Farmer } from "./farmer";

export class MarketDto {
        cropid: Number;
        croptype: String;
        cropName: String;
        fertilizertype: String ;
        quantity: Number;
        baseprice: Number;
        status: boolean;
        farmer:Farmer;
        bidder:Bidder;
}
