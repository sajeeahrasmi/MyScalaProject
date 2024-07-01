package org.jetbrains.scala
package practical_03

object question_01 {
  def main(args: Array[String]): Unit = {
    print("Input a string : ")
    val text = scala.io.StdIn.readLine()
    val reverseText = reverseString(text, text.length()-1)
    println(reverseText)
  }

  def reverseString(text: String, length: Int): String = {
    if(length < 0){
      return ""
    }
    return text.charAt(length)+reverseString(text, length-1)

  }
}
