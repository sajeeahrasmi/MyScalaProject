package org.jetbrains.scala
package practical_03
import scala.util.control.Breaks._

object question_02 {

  def printStrings(strings: Array[String]): Array[String] = {
    var count = 0
    var num = 0
    while (num < strings.size) {
      if (strings(num).length >= 5) {
        count = count + 1
      }
      num = num + 1
    }
    num = 0
    var newString = new Array[String](count)
    var i = 0
    while (num < strings.size) {
      if (strings(num).length >= 5) {
        newString(i) = strings(num)
        i = i + 1
      }
      num += 1
    }
    return newString
  }

  def main(args: Array[String]): Unit = {

    var count: Int = 0
    print("How many list of strings to be input : ")
    count = scala.io.StdIn.readInt()
    var strings : Array[String] = new Array[String](count)
    var i = 0
    while(i<count){
      print("Input string:")
      strings(i) = scala.io.StdIn.readLine()
      i += 1
    }
    var newString = printStrings(strings)
    i = 0
    while(i<newString.size){
      println(newString(i))
      i = i + 1
    }
  }
}
