class Teacher(name:String, surname:String, age:Int, address:Address, wallet:Wallet, Course:Int) extends Human(name,
  surname, age, address, wallet)
{
  private var _Course:Int = Course;

  def CostCourse:Int =_Course;

  override def toString():String = super.toString() + ",\nВартість курсу : " + _Course;

}