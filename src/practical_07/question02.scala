package org.jetbrains.scala
package practical_07

import scala.io.StdIn
object question02 extends App {

  print("How many numbers to input : ")
  var num = StdIn.readInt()
  var numbers: List[Int] = List()

  var i = 0
  while (i < num) {
    print("Enter the number : ")
    var number = StdIn.readInt()
    numbers = numbers :+ number
    i = i + 1
  }


  val calculateSquare = numbers.map(x => x * x)

  println(calculateSquare)
}
