package org.jetbrains.scala
package practical_06

import scala.collection.mutable
import scala.io.StdIn

object question2 extends App {

  def getStudentInfo(): (String, Double, Double, Double, Char) = {
    var run = true
    var total: Double = 0
    var marks: Double = 0
    var name = ""
    while (run) {
      print("Enter student name: ")
      name = StdIn.readLine()
      if (name.nonEmpty) {
        run = false
      }
    }
    run = true
    while (run) {
      print("Enter marks obtained: ")
      marks = StdIn.readDouble()
      if (0 <= marks && marks <= 1000) {
        run = false
      }
    }
    run = true
    while (run) {
      print("Enter total possible marks: ")
      total = StdIn.readDouble()
      if (0 <= total && total <= 1000) {
        run = false
      }
    }

    val per: Double = (marks / total) * 100
    val grade = per match {
      case p if p >= 90 => 'A'
      case p if p >= 75 => 'B'
      case p if p >= 50 => 'C'
      case _ => 'D'
    }

    (name, marks, total, per, grade)
  }

  var studentRecord = getStudentInfo()

  def printStudentRecord(studentRecord: (String, Double, Double, Double, Char)): Unit = {
    println("Name: " + studentRecord._1)
    println("Marks obtained: " + studentRecord._2)
    println("Total Marks: " + studentRecord._3)
    println("Percentage obtained: " + studentRecord._4)
    println("Grade: " + studentRecord._5)
  }

  printStudentRecord(studentRecord)

  def validateInput(studentRecord: (String, Double, Double)): (Boolean, Option[String]) = {
    if (studentRecord._1.isEmpty) {
      (false, Some("Name cannot be empty"))
    } else if (studentRecord._2 < 0 || studentRecord._2 > studentRecord._3) {
      (false, Some("Marks should be greater than 0 and less than or equal to total marks"))
    } else if (studentRecord._3 <= 0) {
      (false, Some("Total possible marks must be greater than 0"))
    } else {
      (true, None)
    }
  }

  def getStudentInfoWithRetry(): (String, Double, Double, Double, Char) = {
    var validInput = false
    var studentRecord: (String, Double, Double) = ("", 0.0, 0.0)
    while (!validInput) {
      print("Enter student name: ")
      val name = StdIn.readLine()
      print("Enter student marks: ")
      val marks = StdIn.readDouble()
      print("Enter total marks: ")
      val total = StdIn.readDouble()

      val result = validateInput((name, marks, total))
      if (result._1) {
        studentRecord = (name, marks, total)
        validInput = true
      } else {
        if (result._2.isDefined) {
          println(result._2.get)
        } else {
          println("Invalid input")
        }
      }
    }

    val per: Double = (studentRecord._2 / studentRecord._3) * 100
    val grade = per match {
      case p if p >= 90 => 'A'
      case p if p >= 75 => 'B'
      case p if p >= 50 => 'C'
      case _ => 'D'
    }

    (studentRecord._1, studentRecord._2, studentRecord._3, per, grade)
  }

  val retryRecord = getStudentInfoWithRetry()
  println(retryRecord)
}
