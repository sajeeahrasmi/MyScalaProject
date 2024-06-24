package org.jetbrains.scala
package practical_02

object Question_01 {
  def main(args: Array[String]){
    var k, i, j = 2
    val m, n = 5
    val f = 12.0f
    val g = 4.0f
    val c = 'X'
    //
    printf("k + 12 * m : " + (k + 12 * m))
    println("\nm / j : " + (m / j))
    println("n % j : " + (n % j))
    println("m / j * j : " + (m / j * j))
    println("f + 10 * 5 + g : " + (f + 10 * 5 + g))
    i = i + 1 // Scala doesn't have pre/post increments
    println(" ++i * n : " + i * n)
  }
}
