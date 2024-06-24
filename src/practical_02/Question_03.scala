package org.jetbrains.scala
package practical_02

object Question_03 {

  def main(args: Array[String]) {
    var homeSalary = calculateSalary(40, 30)
    println("The salary of the employee : " + homeSalary)
  }

  def calculateSalary(normalHours: Int, otHours: Int): Double = {
    var normalHourSalary = normalHours * 250
    var otHourSalary = otHours * 85
    var total = normalHourSalary + otHourSalary
    var tax = total * 12 / 100
    return total - tax
  }

}
