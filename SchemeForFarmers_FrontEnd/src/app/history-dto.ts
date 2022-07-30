import { Bidder } from "./Bidder"
import { Crop } from "./crop"
import { Farmer } from "./farmer"

export class HistoryDto {
    sellcropid:Number
    cropid:Number
    farmerid:Number
    bidderid:Number
    bidprice:Number
    sold:boolean
    farmer:Farmer
    bidder:Bidder
    crop:Crop
}

