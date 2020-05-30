object SumOfEvenNumbers extends App{
  def checkEvenNumbers(n:Int):Int ={
    if(n%2 == 0)
      return n-2
    else
      return n-1
  }

  def addEvenNumbers(m:Int):Int = m match{
    case 0 => 0
    case 1 => 1
    case _ => m+addEvenNumbers(m-2)
  }

  println("Enter a number to get the addition of even numbers below it : ")
  val number=scala.io.StdIn.readInt()
  println(addEvenNumbers(checkEvenNumbers(number)))

}
