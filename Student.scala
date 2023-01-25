class Student(name:String, surname:String, age:Int, address:Address, wallet:Wallet, group:Int)
  extends Human(name, surname, age, address, wallet)
  {
  private var _group: Int = group;

  def Group: Int = _group;
}