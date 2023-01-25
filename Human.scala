class Human(var name:String, var surname:String, var age:Int, var address:Address,
            var wallet:Wallet)
{
  private var _name:String=name;
  private var _surname:String=surname;
  private var _age:Int=age;
  private var _address:Address=address;
  private var _wallet:Wallet = wallet;


  def Name:String=_name;
  def Surname:String=_surname;
  def Age:Int=_age;
  def Address:Address=_address;
  def Exchange:Wallet=_wallet;

  override def toString():String=s"Ім'я : $name, \nПрізвище : $surname, \nВік : $age, \nАдреса : $address, $wallet";

}
