package p16_Constructor

/*
Created by smeetbhatt on 25/09/17
*/

//Constructor
class Human (var n : String = "NO_Value")
{
    var name : String? = n
    fun think(){
        println("Thinking...!  $name")
    }
}

fun main(args : Array<String>){
    var v1 = Human()
    v1.think()
}