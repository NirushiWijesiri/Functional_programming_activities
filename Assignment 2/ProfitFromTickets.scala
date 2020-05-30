object ProfitFromTickets extends App{
  def calculateAttendees(ticketPrice: Int): Int={
    120+(15-ticketPrice)/5*20
  }
  def calculateTheRevenue(ticketPrice: Int): Int={
    calculateAttendees(ticketPrice)*ticketPrice
  }
  def calculateTheCost(ticketPrice: Int): Int={
    500+calculateAttendees(ticketPrice)*3
  }
  def calculateTheProfit(ticketPrice: Int): Int={
    calculateTheRevenue(ticketPrice)-calculateTheCost(ticketPrice)
  }
  println("Enter the ticket price : ")
  val ticketPrice=scala.io.StdIn.readInt()
  val profit=calculateTheProfit(ticketPrice)
  println("The profit : " + profit)
}
