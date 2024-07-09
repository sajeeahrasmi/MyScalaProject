package org.jetbrains.scala
package practical_04

object question_03 extends App {
  def toUpper(word: String): String = {
    word.toUpperCase
  }
  def toLower(word: String): String = {
    word.toLowerCase
  }
  def formatNames(name: String)(formatFunc: String => String): String = {
    formatFunc(name)
  }

  println(toUpper("Benny"))

  println(formatNames("Niroshan")(name => {
    val firstPart = name.substring(0, 2).toUpperCase
    val secondPart = name.substring(2)
    firstPart + secondPart
  }))

  println(toLower("Saman"))

  println(formatNames("Kumara")(name => {
    val firstPart = name.substring(0, 1)
    val middlePart = name.substring(1, name.length - 1).toLowerCase
    val lastPart = name.substring(name.length - 1).toUpperCase
    firstPart + middlePart + lastPart
  }))
}
