package org.jetbrains.scala
package practical_04

object question_02 extends App {
  var num: Int = 0
  print("Input number : ")
  num = scala.io.StdIn.readInt()

  def patternMatching(num: Int): Unit = {
    num match {
      case n if n <= 0 => println("Negative/Zero is input")
      case n if n % 2 == 0 => println("Even number is given")
      case _ => println("Odd number is given")
    }
  }

  patternMatching(num)
}
