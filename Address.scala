class Address(var country:String, var city:String, var street:String, house:Int){
  private var _country:String = country
  private var _city:String = city
  private var _street:String = street
  private var _house:Int = house
  override def toString: String = s"$country, $city, $street, $house"
}