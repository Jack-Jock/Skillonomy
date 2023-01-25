class Exchange( var token:Int, var fiat:Int)
{
  private var _token:Int=1000000;
  private var _fiat:Int=fiat;

  def Token:Int=_token;
  def Fiat:Int=_fiat;

  override def toString():String=s"\nТокени :  $token, \nВалюта на біржі :  $fiat";
}
