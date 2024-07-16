package org.jetbrains.scala
package practical_05
import scala.io.StdIn
import scala.collection.immutable.Set
import scala.collection.{IterableOnce, mutable}

object question_02 extends App {
  case class Book(title: String, author: String, isbn: String)

  var books: mutable.Set[Book] = collection.mutable.Set(
    Book("Harry Potter and the Chamber of secrets", "JK Rowling", "789"),
    Book("How to train your dragons", "Cressida Cowell", "456"),
    Book("Alice in wonderland", "Lewis Caroll", "123")
//    Book("Alice ", "Lewis Caroll", "963")
  )

  def addNewBook(books: mutable.Set[Book]):mutable.Set[Book]  = {
    var title: String = ""
    var name : String= ""
    var isbn : String= ""
    print("Enter book title to add new book: ")
    title = scala.io.StdIn.readLine()
    print("Enter author name: ")
    name = scala.io.StdIn.readLine()
    print("Enter ISBN: ")
    isbn= scala.io.StdIn.readLine()
    var book = Book(title, name, isbn)
    books + book

  }

  books = addNewBook(books)

  def removeBook(books: mutable.Set[Book]): mutable.Set[Book] = {
    var isbn = ""
    print("Enter the ISBN number for the book to be removed : ")
    isbn = scala.io.StdIn.readLine()
    books.find(_.isbn == isbn) match {
      case Some(book) =>
        books -= book
        println("Book has been removed.")
      case None =>
        println("There is no such book.")
    }
    books
  }

  books = removeBook(books)

  def checkBook(books: mutable.Set[Book]): Unit = {
    var isbn = ""
    print("Enter the ISBN number for the book to be checked : ")
    isbn = scala.io.StdIn.readLine()
    var available = books.exists(_.isbn == isbn)
    if (available) {
      println("The book is there.")

    } else {
      println("There is no such book.")
    }
  }

  checkBook(books)


  def displayBooks(books: mutable.Set[Book]): Unit = {
    books.foreach(i=>println(i))
  }

  displayBooks(books)

  def seacrhBook(books: mutable.Set[Book]): Unit = {
    print("Enter the book title to search book: ")
    var title = scala.io.StdIn.readLine()
    books.foreach(book => if(book.title.toLowerCase.contains(title.toLowerCase)) {
      println(book)
      return
    })
    println("There is no such book.")
  }

  seacrhBook(books)

  def displayBooksByAuthor(books: mutable.Set[Book]): Unit = {
    print("Enter the author of book to search book/s: ")
    var author = scala.io.StdIn.readLine()
    var i = 0
    books.foreach(book => if(book.author.toLowerCase.contains(author.toLowerCase)) {
      println(book)
      i += 1
    })
    if(i==0)
    println("There is no such book.")
  }

  displayBooksByAuthor(books)


}
