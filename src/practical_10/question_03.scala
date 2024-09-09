package org.jetbrains.scala
package practical_10

object question_03 extends App {

  class Account(id:String, accNum: Int, bal:Double){

    val holder_id = id
    val accountNumber = accNum
    var balance = bal

    def withdraw(amount: Double): Double = {
      if (this.balance < amount) {
        return balance
      }
      this.balance = this.balance - amount
      this.balance
    }

    def deposit(amount: Double): Double = {
      this.balance = this.balance + amount
      this.balance
    }

    def transfer(other:Account, amount:Double): Unit = {
      if(this.balance <= 0 || this.balance < amount){
        return other
      }
      this.balance = this.balance - amount
      other.balance = other.balance + amount
      other
    }
  }

  var account1 = new Account("456", 741, 45000)
  var account2 = new Account("123", 963, 12000)

  account1.withdraw(5000)
  println("The balance of account number "+ account1.accountNumber+" : "+account1.balance)

  account2.deposit(3000)
  println("The balance of account number "+ account2.accountNumber+" : "+account2.balance)

  account1.transfer(account2, 5000)

  println("The balance of account number "+ account1.accountNumber+" : "+account1.balance)
  println("The balance of account number "+ account2.accountNumber+" : "+account2.balance)

}
