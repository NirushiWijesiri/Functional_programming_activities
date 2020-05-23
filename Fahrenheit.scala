object Fahrenheit extends App{
  def converting(x: Double)= x*1.8+32
  val result = converting(35.0)
  println("Temperature in Fahrenheit : " + result)

}
