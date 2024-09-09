package org.jetbrains.scala
package practical_10

object question_04 extends App {

  class Account(accNum: Int, bal: Double) {

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

    def transfer(other: Account, amount: Double): Unit = {
      if (this.balance <= 0 || this.balance < amount) {
        return other
      }
      this.balance = this.balance - amount
      other.balance = other.balance + amount
      other
    }
  }

  var bank: List[Account] = List(
    new Account(1, 1000),
    new Account(2, 1500),
    new Account(3, -5),
    new Account(4, -3)
  )

  def negativeBalanceAccounts(bank: List[Account]) : List[Account] = bank.filter(_.balance < 0)

  def sumOfAllAccountBalance(bank: List[Account]) : Double = bank.map(_.balance).sum

  def calculateInterest(bank: List[Account]) : List[Account]  = {
    bank.map { account =>
      if (account.balance > 0) {
        account.balance += account.balance * 0.05
      } else {
        account.balance += account.balance * 0.1
      }
      account
    }
  }

  val negativeBalanceAccountsList = negativeBalanceAccounts(bank)
  println(negativeBalanceAccountsList.map{ account =>
    account.accountNumber
  })

  val sum = sumOfAllAccountBalance(bank)
  println(sum)

  val interest = calculateInterest(bank)
  println(interest.map { account =>
    account.accountNumber + " : "+ account.balance
  })

}
