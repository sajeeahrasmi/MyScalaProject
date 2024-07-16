package org.jetbrains.scala
package practical_05

object question_01 extends App {

  def getProductList():List[String] = {
    var products: List[String] = List()
    var name : String = ""
    while(true){
      print("Input product name (Type 'done' to stop) : ")
      name = scala.io.StdIn.readLine()
      if (name == "done") {
        return products
      } else {
        products = name :: products
      }
    }
    return products
  }

  def printProductList(products : List[String]): Unit = {
    var i = products.size-1
    while(i>=0){
      println((products.size - i )+". "+products(i))
      i -= 1
    }
  }

  var products: List[String] = getProductList()
  printProductList(products)

  def getTotalProducts(products: List[String]): Int = {
    return products.size
  }

  var total : Int = getTotalProducts(products)
  println("The total number of products in the list is : "+total)
}
