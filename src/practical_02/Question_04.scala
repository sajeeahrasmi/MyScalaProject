package org.jetbrains.scala
package practical_02

object Question_04 {

  def main(args: Array[String]) {
    var profit = calculateProfit(20)
    println("The profit for the ticket price 20 : " + profit)
  }

  def calculateProfit(ticketPrice: Double): Double = {
    var peopleAttended = 120 + (15 - ticketPrice) * 4
    var income = ticketPrice * peopleAttended
    var expense = 500 + peopleAttended * 3
    var profit = income - expense
    return profit
  }

}
