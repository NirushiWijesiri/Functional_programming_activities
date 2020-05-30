object Sum extends App{
  def sum(n:Int):Int={
    n match{
      case 1 => n
      case _ => n+sum(n-1)
    }
  }
  println("Enter a number : ")
  val number=scala.io.StdIn.readInt()
  println(sum(number))

}
