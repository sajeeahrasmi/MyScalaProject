package org.jetbrains.scala
package practical_10

object question_01 extends App {

  class Rational(n: Int, d:Int ) {
    if (d == 0){
      throw  new  IllegalArgumentException("Denominator cannot be zero")
    }

    val numerator = n
    val denominator = d

    def neg: Rational = new Rational(-numerator, denominator)
  }

  val x = new Rational(-3, 5)
  println(x.numerator+"/"+x.denominator)
  println(x.neg.numerator+"/"+x.neg.denominator)
}
