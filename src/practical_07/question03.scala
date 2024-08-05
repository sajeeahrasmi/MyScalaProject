package org.jetbrains.scala
package practical_07

import scala.io.StdIn

object question03 extends App {

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


  def prime(x: Int): Boolean = {
    if(x==1){
      return false
    }
    var i = 2
    while(i<x){
      if(x%i==0){
        return false
      }
      i += 1
    }
    return  true
  }

  val filterPrime = numbers.filter(x => prime(x))

  println(filterPrime)
}
