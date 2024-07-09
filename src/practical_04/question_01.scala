package org.jetbrains.scala
package practical_04

object question_01 extends App {
  var num : Int = 0
  print("How many items are there : ")
  num = scala.io.StdIn.readInt()
  var itemName : Array[String] = new Array[String](num)
  var itemQty : Array[Int] = new Array[Int](num)

  var i = 0
  while (i < num) {
    print("Input item name:")
    itemName(i) = scala.io.StdIn.readLine()
    print("Input item quantity: ")
    itemQty(i) = scala.io.StdIn.readInt()
    i += 1
  }

  def displayInventory(itemName: Array[String], itemQty: Array[Int]): Unit = {
    var i = 0
    while(i<itemQty.size){
      println(itemName(i)+"\t= "+itemQty(i))
      i += 1
    }
  }

  displayInventory(itemName, itemQty)
  var name : String = ""
  var qty : Int = 0

  print("Input item name to restock:")
  name = scala.io.StdIn.readLine()
  print("Input item quantity to restock: ")
  qty = scala.io.StdIn.readInt()

  def restockItem(name: String, qty: Int, itemName: Array[String], itemQty: Array[Int]): Unit = {
    var i =0
    while(i<itemQty.size){
      if(itemName(i) == name){
        itemQty(i) += qty
        return
      }
      i += 1
    }
    println("There is no such item")
  }

  restockItem(name, qty,itemName, itemQty)

  print("Input item name to sell:")
  name = scala.io.StdIn.readLine()
  print("Input item quantity to sell: ")
  qty = scala.io.StdIn.readInt()

  def sellItem(name: String, qty: Int, itemName: Array[String], itemQty: Array[Int]): Unit = {
    var i = 0
    while (i < itemQty.size) {
      if (itemName(i) == name) {
        itemQty(i) -= qty
        return
      }
      i += 1
    }
    println("There is no such item")
  }

  sellItem(name, qty,itemName, itemQty)

}
