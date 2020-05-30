object TakeHomeSalary extends App{

  def calculateWage(wHours: Int): Double={
    wHours*150
  }
  def calculateOt(oHours: Int): Double={
    oHours*75
  }
  def calculateIncome(h1: Int, h2: Int): Double={
    calculateWage(h1)+calculateOt(h2)
  }
  def calculateTax(income: Double): Double={
    income*0.1
  }
  def calculateTakeHome(wHours: Int, oHours: Int): Double ={
    calculateIncome(wHours, oHours)-calculateTax(calculateIncome(wHours, oHours))
  }

  println("Enter the number of wage hours : ")
  val wHours=scala.io.StdIn.readInt()
  println("Enter the number of OT hours : ")
  val oHours=scala.io.StdIn.readInt()
  val takeHomeSalary = calculateTakeHome(wHours,oHours)
  println("Take Home Salary : " + takeHomeSalary)
}
