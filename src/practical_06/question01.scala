package org.jetbrains.scala
package practical_06

import scala.collection.mutable
import scala.io.StdIn

case class Product (name:String, qty:Int, price:Double)
object question01 extends App{

  val inventory1: mutable.Map[Int, Product] = mutable.Map()
  val inventory2: mutable.Map[Int, Product] = mutable.Map()

  println("Entering Values for Inventory 01...................")
  print("How many products to be entered: ")
  var num = StdIn.readInt()
  var i = 1
  var pKey = 1
  var name = ""
  var qty = 1
  var price = 1.0
  while(i<=num){
    print("Enter the product key " +i+" : " )
    pKey = StdIn.readInt()
    print("Enter the product name : ")
    name = StdIn.readLine()
    print("Enter the product qty : ")
    qty = StdIn.readInt()
    print("Enter the product price : ")
    price = StdIn.readDouble()

    inventory1(pKey) = Product(name, qty, price)
    i += 1
  }

  println("Entering Values for Inventory 02...................")
  print("How many products to be entered: ")
  num = StdIn.readInt()
  i = 1
  while (i <= num) {
    print("Enter the product key " + i + " : ")
    pKey = StdIn.readInt()
    print("Enter the product name : ")
    name = StdIn.readLine()
    print("Enter the product qty : ")
    qty = StdIn.readInt()
    print("Enter the product price : ")
    price = StdIn.readDouble()

    inventory2(pKey) = Product(name, qty, price)
    i += 1
  }

  var names : List[String] = inventory1.values.map(_.name).toList
  println("All product names in inventory1: " + names )

  def calculateTotalValue(inventory1: mutable.Map[Int, Product]): Double = {
    inventory1.values.map(p => p.qty * p.price).sum
  }

  var sum: Double = calculateTotalValue(inventory1)
  println("The total product sum in inventory 1 : "+ sum)

  if(inventory1.isEmpty){
    println("The inventory 1 is empty")
  }else{
    println("The inventory 1 is not empty")
  }

  def mergeInventories(inventory1: mutable.Map[Int, Product], inventory2: mutable.Map[Int, Product]): mutable.Map[Int, Product] = {
    inventory2.foreach {
      case (pKey, product2) =>
        inventory1.get(pKey) match {
          case Some(product1) =>
            inventory1.update(pKey, Product(
              product1.name,
              product1.qty + product2.qty,
              math.max(product1.price, product2.price)
            ))
          case None => inventory1(pKey) = product2
        }
    }
    inventory1
  }

  val inventory: mutable.Map[Int, Product] = mergeInventories(inventory1, inventory2)
  println("Merged inventory: " + inventory)

  print("Enter the product key to be searched : ")
  pKey = StdIn.readInt()

  inventory.get(pKey) match {
    case Some(product) => println(pKey + " : " + product)
    case None => println("There is no such product")
  }
}
