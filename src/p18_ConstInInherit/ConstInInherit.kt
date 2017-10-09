package p18_ConstInInherit

/*
Created by smeetbhatt on 09/10/17
*/

//By default we cannot inherit a class in kotlin. To make it available for other classes to inherit then we use keyword "open".
open class Human(age : Int) {

    init {
        println("In Human.. $age")
    }
    open fun think(){
        println("Real Thinking")
    }
}

class Allien(age: Int) : Human(age){

    init {
        println("In Allien")
    }
    //we use override keyword before overriding the function from the parent class, and in parent class we use open before function
    override fun think(){
        println("Virtual thinking")
    }
}

fun main(args : Array<String>){
    var krupa = Allien(11)
    krupa.think()
}

