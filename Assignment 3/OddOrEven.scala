object OddOrEven extends App{
  def isEven(n:Int):Boolean= n match{
    case 0 => true
    case _ => isOdd(n-1)
  }
  def isOdd(n:Int):Boolean = !(isEven(n))

  println("Enter a number to check if it is odd or even : ")
  val number=scala.io.StdIn.readInt()
  if(isEven(number)==true)
    println("Even")
  else
    println("Odd")

}
