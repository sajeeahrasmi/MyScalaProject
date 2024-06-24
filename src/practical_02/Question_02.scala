package org.jetbrains.scala
package practical_02

object Question_02 {
  def main(args: Array[String]) {
    var a = 2
    var b = 3
    var c = 4
    var d = 5
    var k = 4.3f
    b = b - 1
    println("--b * a + c * d-- : " + (b * a + c * d))
    d = d - 1
    println("a++ : " + a)
    a = a + 1
    println("-2 * (g - k) + c : " + (-2 * (b - k) + c))
    println("c=c++ : " + c)
    c = c + 1
    c = c + 1
    println("c = ++c*a++ : " + c + a)
    a = a + 1
  }

}
