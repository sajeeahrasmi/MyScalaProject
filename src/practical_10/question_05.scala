package org.jetbrains.scala
package practical_10

object question_05 extends App {

  def countLetter(words: List[String]) : List[Int] = {
    val length = words.map(word => word.length)
    length
  }
  def countTotal(words: List[Int]) : Int = {
    val total = words.reduce((a, b) => a+b)
    total
  }

  val words = List("apple", "banana", "cherry", "date")
  val count = countLetter(words)
  println(count)
  val total = countTotal(count)
  println(total)
}
