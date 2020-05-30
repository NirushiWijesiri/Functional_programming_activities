object PrimeSequence extends App{
  @scala.annotation.tailrec
  def GCD(a:Int,b:Int):Int=b match{
    case 0 => a
    case x if x>a => GCD(x,a)
    case _ => GCD(b,a%b)
  }

  @scala.annotation.tailrec
  def prime(p:Int, n:Int=2):Boolean= n match {
    case x if x == p => true
    case x if GCD(p,x)>1 => false
    case x => prime(p,x+1)
  }

  @scala.annotation.tailrec
  def primeSeq(n:Int):Unit={
    if (prime(n))
      println(n)
    if(n>2)
      primeSeq(n-1)
  }

  println("Enter a number to get the prime sequence : ")
  val number=scala.io.StdIn.readInt()
  primeSeq(number)
}
