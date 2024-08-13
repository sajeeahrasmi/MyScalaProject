package org.jetbrains.scala
package practical_08
import scala.io.StdIn
object question02 extends App {

  print("Input an integer : ")
  var num = StdIn.readInt()

  val multipleOfThree = (n:Int) => n%3==0
  val multipleOfFive = (n:Int) => n%5==0

  num match{
    case 0 => println("Not a Multiple of Three or Five")
    case n if multipleOfThree(n) && multipleOfFive(n) => println("Multiple of Both Three and Five")
    case n if multipleOfThree(n) => println("Multiple of Three")
    case n if multipleOfFive(n) => println("Multiple of Five")
    case _ => println("Not a Multiple of Three or Five")
  }

}
