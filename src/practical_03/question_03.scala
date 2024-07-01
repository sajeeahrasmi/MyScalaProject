package org.jetbrains.scala
package practical_03

object question_03 {

  def findMean(num1: Int, num2: Int): Float = {
    return (num1+num2)/2.0f
  }

  def main(args: Array[String]): Unit = {
    print("Input number 1 : ")
    var num1 = scala.io.StdIn.readInt()
    print("Input number 2 : ")
    var num2 = scala.io.StdIn.readInt()

    var mean : Float = findMean(num1, num2)
    println(f"The mean : $mean%.2f")
  }
}
