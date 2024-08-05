package org.jetbrains.scala
package practical_07

import scala.io.StdIn
object question01 extends App {

  print("How many numbers to input : ")
  var num = StdIn.readInt()
  var numbers: List[Int]= List()

  var i = 0
  while (i<num){
    print("Enter the number : ")
    var number = StdIn.readInt()
    numbers = numbers :+ number
    i = i + 1
  }


  val filterEvenNumbers = numbers.filter(x => x%2==0)

  println(filterEvenNumbers)

}
