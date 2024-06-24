package org.jetbrains.scala

object Project_01 {

  def main(args: Array[String]) {
    val area = calculateAreaOfDisk(5)
    printf("The area of the disk is: " + area)
    val temperature = convertToFahrenheit(35)
    printf("\nThe temperature in fahrenheit is: " + temperature)
    val volume = calculateVolumeOfSphere(5)
    printf("\nThe volume of sphere is: " + volume)

    val wholesale = calculateWholesale(60)
    printf("\nThe wholesale cost is: " + wholesale)

    val time = calculatingTime()
    printf("\nThe total running time is: "+ time)

  }
  def calculateAreaOfDisk(radius: Int): Double = {3.14 * radius * radius}
  def convertToFahrenheit(temp: Double): Double = {temp * 1.8000 + 32.00}
  def calculateVolumeOfSphere(radius: Int): Double = {4/3 * 3.14 * radius*radius*radius}

  def calculateWholesale(numOfBooks: Int): Double = {
    var sum = numOfBooks * 24.95
    var discount = 24.95 * 40 /100
    var total = sum - discount
    var shippingCost = (numOfBooks - 50) * 0.75
    return total + shippingCost
  }
  def calculatingTime(): Double = {
    var easypace = 4 * 8
    var tempo = 3 * 7
    return  easypace+ tempo
  }
}
