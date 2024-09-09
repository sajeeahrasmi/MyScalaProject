package org.jetbrains.scala
package practical_10

object question_02 extends App {

  class Rational(n: Int, d: Int) {
    if (d == 0) {
      throw new IllegalArgumentException("Denominator cannot be zero")
    }

    val numerator = n
    val denominator = d

    def sub ( rational: Rational): Rational = {
      val newNumer = this.numerator * rational.numerator - rational.numerator - this.numerator
      val newDeno = this.denominator * rational.denominator

      new Rational(newNumer, newDeno)
    }
  }

  val x = new Rational(3, 4)
  val y = new Rational(5, 8)
  val z = new Rational(2, 7)

  val r1 = y.sub(z)
  val r2 = x.sub(r1)

  println(r1.numerator+"/"+r1.denominator)
  println(r2.numerator+"/"+r2.denominator)
}
