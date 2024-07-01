package org.jetbrains.scala
package practical_03

object question_04 {

  def printStrings(integers: Array[Int]): Int = {
    var num = 0
    var sum = 0
    while (num < integers.size) {
      if (integers(num) %2 == 0) {
       sum += integers(num)
      }
      num = num + 1
    }
    return sum
  }

  def main(args: Array[String]): Unit = {

    var count: Int = 0
    print("How many list of integers to be input : ")
    count = scala.io.StdIn.readInt()
    var integers: Array[Int] = new Array[Int](count)
    var i = 0
    while (i < count) {
      print("Input integer:")
      integers(i) = scala.io.StdIn.readInt()
      i += 1
    }
    var sum = printStrings(integers)

    println("The sum : "+sum)

  }


}
