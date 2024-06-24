package org.jetbrains.scala

object Main {
  def main(args: Array[String]) {
//    val outerRadius  = 14
//    val innerRadius = 7
//    printf("The area of the ring is : "+ (calculateArea(outerRadius, innerRadius)))
    var hour = 40
    var otHour = 20
    var wage = calculateNormalWage(hour)
    var otWage = calculateOTHours(otHour)

  }

  def calculateNormalWage(hours : Int): Double = {hours * 150}

  def calculateArea(num1: Int, num2 : Int): Double = 3.14 * num1 * num1 - 3.14 *num2*num2
  def calculateOTHours(hours : Int): Double = {hours * 75}
}