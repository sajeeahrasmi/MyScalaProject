package org.jetbrains.scala
package practical_09
import scala.io.StdIn

object question01 extends App {
  print("Enter the amount to be deposited: ")
  var deposit = StdIn.readInt()

  val actualAmount = (deposit: Int) => deposit match{
    case n if n>0 && n<=20000 => deposit+deposit*0.2
    case n if n>20000 && n<=200000 => deposit+deposit*0.4
    case n if n>200000 && n<=2000000 => deposit+deposit*0.35
    case n if n>2000000 => deposit+deposit*0.65
    case _ => 0
  }

  print(actualAmount(deposit))


}
