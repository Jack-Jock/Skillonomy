class Wallet( var token:Int, var fiat:Int)
{
  override def toString():String=s"\nТокени : $token, \nВалюта на біржі :  $fiat";
}