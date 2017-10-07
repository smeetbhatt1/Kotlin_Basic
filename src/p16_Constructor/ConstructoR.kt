package p16_Constructor

/*
Created by smeetbhatt on 07/10/17
*/

//if no access specifier is defined then we don't need to write keyword "constructor".
class Human constructor(var n : String){

    var name : String = n
    fun think(){
        println("In class Hello.. $name");
    }
}

//if we define access modifier then we have to write keyword "constructor".
class Student public constructor(var n : String){

    var name : String = n
    fun think(){
        println("In class Student.. $name");
    }
}

fun main(args: Array<String>){
    var name = Human("Smeet")
    name.think()
}

