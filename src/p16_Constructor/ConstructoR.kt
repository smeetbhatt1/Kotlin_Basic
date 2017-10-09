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

//init{} is used like in java if u create an object of call it perform some action defined in constructor
class Human1 constructor(var n : String){
    var name: String? = null
    init {
        println("calling init from Human1");
        name = n
    }

    fun think(){
        println("In class Hello.. $name");
    }
}

class Human2 constructor(var n : String){
    var age : Int = 0
    var name: String = n
    constructor(age : Int,name : String) : this(name){
        this.age = age
        this.name = name
    }

    fun think(){
        println("In class Hello.. $name : $age");
    }
}

fun main(args: Array<String>){
    var name = Human("Smeet")
    name.think()

    var name1 = Human2(20,"Smeet")
    name1.think()
}

