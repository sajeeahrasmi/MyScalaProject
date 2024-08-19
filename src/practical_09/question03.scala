package org.jetbrains.scala
package practical_09

object question03 extends App {

  val upperName = (name:String) => {
    name.toUpperCase
  }
  val lowerName = (name: String) => {
    name.toLowerCase
  }

  val formatType1 = (name: String) =>{
    name.substring(0,2).toUpperCase + name.substring(2).toLowerCase
  }

  val fromatType2 = (name: String) => {
    name.substring(0,1).toUpperCase + name.substring(1, name.length-1).toLowerCase + name.substring(name.length-1).toUpperCase
  }

  println(upperName("Benny"))
  println(formatType1("niroshan"))
  println(lowerName("Saman"))
  println(fromatType2("Kumara"))
}
