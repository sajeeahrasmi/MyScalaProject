package org.jetbrains.scala

object Practical_02 {
  def main(args: Array[String]) {
//    var k, i, j = 2
//    val m , n = 5
//    val f = 12.0f
//    val g = 4.0f
//    val c = 'X'
//
//    printf("k + 12 * m : "+(k + 12 * m))
//    println("\nm / j : "+ (m/j) )
//    println("\nn % j : "+ (n % j))
//    println("\nm / j * j : "+ (m / j * j))
//    println("\nf + 10 * 5 + g : "+(f + 10 * 5 + g))
//    i = i + 1 // Scala doesn't have pre/post increments
//    println("\n ++i * n : "+ i * n)

//    var a =2
//    var b = 3
//    var c = 4
//    var d = 5
//    var k = 4.3f
//    b = b - 1
//    println("--b * a + c * d-- : " + ( b * a + c * d))
//    d = d - 1
//    println("a++ : "+ a)
//    a = a + 1
//    println("-2 * (g - k) + c : "+(-2 * (b - k) + c))
//    println("c=c++ : "+ c)
//    c = c + 1
//    c = c + 1
//    println("c = ++c*a++ : "+ c+a)
//    a = a + 1

    var homeSalary = calculateSalary(40, 30)
    println("The salary of the employee : "+ homeSalary)

    var profit = calculateProfit(20)
    println("The profit for the ticket price 20 : "+ profit)
  }

  def calculateSalary(normalHours: Int, otHours: Int): Double = {
    var normalHourSalary = normalHours * 250
    var otHourSalary = otHours * 85
    var total = normalHourSalary + otHourSalary
    var tax = total * 12 / 100
    return total - tax
  }

  def calculateProfit(ticketPrice: Double): Double = {
    var peopleAttended = 120 + (15 - ticketPrice) * 4
    var income = ticketPrice * peopleAttended
    var expense = 500 + peopleAttended * 3
    var profit = income - expense
    return profit
  }
}
