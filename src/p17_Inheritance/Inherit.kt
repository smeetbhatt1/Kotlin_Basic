package p17_Inheritance

/*
Created by smeetbhatt on 09/10/17
*/

//By default we cannot inherit a class in kotlin. To make it available for other classes to inherit then we use keyword "open".
open class Human{
    open fun think(){
        println("Real Thinking")
    }
}

class Allien : Human(){

    //we use override keyword before overriding the function from the parent class, and in parent class we use open before function
    override fun think(){
        println("Virtual thinking")
    }
}

fun main(args : Array<String>){
    var krupa = Allien()
    krupa.think()
}

