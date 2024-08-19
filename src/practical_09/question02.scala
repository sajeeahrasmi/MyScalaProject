package org.jetbrains.scala
package practical_09

import scala.io.StdIn

object question02 extends App {
  print("Input an integer")
  var num = StdIn.readInt()

  val checkNumber = (num:Int) => num match {
    case n if n == 0 => "Zero is input"
    case n if n<0 && n%2 == 0=> "Negative is input\nEven number is given"
    case n if n<0 && n%2 != 0=> "Negative is input\nOdd-13 number is given"
    case n if n%2 == 0 => "Even number is given"
    case n if n%2 != 0 => "Odd number is given"
    case _ => "Invalid input"
  }

  println(checkNumber(0))
}
