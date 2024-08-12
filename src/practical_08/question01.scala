package org.jetbrains.scala
package practical_08

import scala.io.StdIn
import scala.util.control.Breaks.break



object question01 extends App {

  print("Enter the text : ")
  var text = StdIn.readLine()

  var shifts = 0

  var run = true
  while(run){
    print("Enter the no.of shifts: ")
    shifts = StdIn.readInt()
    if(shifts >= 0 && shifts <= 23){
      run = false
    }else{
      println("Shifts must be between 0 and 23.")
    }
  }

  def getAlphabetPosition(c: Char): Int = {
    c.toUpper - 'A' + 1
  }

  def getLetterAtPosition(encryptPos: Int): Char ={
    ('A' + (encryptPos - 1)).toChar
  }

  def encryptText(text: String, shifts: Int): String = {
    val data = text.toLowerCase()
    var encryptData = ""

    for (i <- 0 until data.length) {
      val currentChar = data.charAt(i)
      if (currentChar.isLetter) {
        val position = getAlphabetPosition(currentChar)
        val encryptPos = (shifts + position) % 26 match {
          case 0 => 26
          case x => x
        }
        val encryptChar = getLetterAtPosition(encryptPos)
        encryptData += encryptChar
      } else {
        encryptData += currentChar
      }
    }
    encryptData.toLowerCase()
  }

  def decryptText(text: String, shifts: Int): String = {
    val data = text.toLowerCase()
    var decryptData = ""

    for (i <- 0 until data.length) {
      val currentChar = data.charAt(i)
      if (currentChar.isLetter) {
        val position = getAlphabetPosition(currentChar)
        var decryptPos = (position - shifts) % 26
        if (decryptPos <= 0) {
          decryptPos += 26
        }
        val decryptChar = getLetterAtPosition(decryptPos)
        decryptData += decryptChar
      } else {
        decryptData += currentChar
      }
    }
    decryptData.toLowerCase()
  }

  def cipher(func: (String, Int) => String, text:String, shifts:Int): String = {
    func(text, shifts)
  }

  var encryptedText = cipher(encryptText, text, shifts)
  println(encryptedText)
  var decryptedText = cipher(decryptText, encryptedText, shifts)
  println(decryptedText)
}
