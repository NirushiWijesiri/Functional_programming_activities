object WholeSaleCost extends App{
  def calculatePrice(a: Int): Double ={
    a*24.95
  }
  def calculateDiscount(b: Double): Double ={
    b*40/100
  }
  def calculateNewPrice(x: Double, y: Double): Double ={
    x-y
  }
  def calculateShippingCost(n: Int): Double ={
    if(n<=50)
      3
    else
      3+((n-50)*0.75)
  }
  val result = calculateNewPrice(calculatePrice(60),calculateDiscount(calculatePrice(60)))+calculateShippingCost(60)
  println("The Final Cost : " + result)

}
