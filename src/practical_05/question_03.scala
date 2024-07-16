package org.jetbrains.scala
package practical_05

object question_03 extends App{
  var firstNum = 0
  var secondNum = 1
  print("Enter how many numbers to be print : ")
  var num = scala.io.StdIn.readInt()
  def fibonacci( num:Int): Int = {
    if(num == 0 || num == 1 ){
      return num
    }else{
      return fibonacci(num-1) + fibonacci(num-2)
    }
  }

  def printFibonacci(num : Int): Unit = {
    if(num>0){
      printFibonacci(num-1)
    }
    println(fibonacci(num))
  }

  printFibonacci(num)
}
