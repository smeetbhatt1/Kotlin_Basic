package p16_Constructor

/*
Created by smeetbhatt on 25/09/17
*/

//Constructor

//Primary constructor.
class Human (var n : String = "NO_Value")
{
    var name : String? = n
    fun think(){
        println("Thinking...!  $name")
    }
}

class Human2(var n: String) {
    var name: String = n

    init {
        println("in init")
        name = n
        println("out...")
    }
    fun think(){
        println("Thinking...!  $name")
    }
}


//Secondary constructor
//when we call secondary constructor we also need to define primary constructor.
class Human3(var n: String){
    var age: Int = 0
    var name: String = n

    constructor(age: Int, name: String) : this(name) {
        this.age = age
    }

    fun think(){
        println("Thinking...!  $name : $age")
    }

}
fun main(args : Array<String>){

    var v1 = Human()
    v1.think()

    var v2 = Human2("S")
    v2.think()

    var v3 = Human3(4,"S")
    v3.think()

}