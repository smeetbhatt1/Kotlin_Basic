package p20_ObjectKeyword


/*
Created by smeetbhatt, 
on 26/10/17
*/

data class Book (var name: String, var price: Double)

object bookSelf{
    var books = arrayListOf<Book>()

    fun displayBooks(){
        for (i in books)
            println(i)
    }
}

fun main(args : Array<String>){
    bookSelf.books.add(Book("Java",price = 200.0))
    bookSelf.books.add(Book("Php",price = 150.0))
    bookSelf.books.add(Book("Kotlin",price = 250.8))
    bookSelf.books.add(Book("C++",price = 220.7))

    bookSelf.displayBooks()
}