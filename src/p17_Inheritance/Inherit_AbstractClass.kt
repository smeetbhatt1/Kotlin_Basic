package p17_Inheritance


/*
Created by smeetbhatt, 
on 26/10/17
*/

/*
we use open keyword because by default when we define
a class in kotlin its final type. So inheritance is not possible,
to make inheritance possible please use open keyword.
*/
abstract class Human1() {

    //we use open keyword in class that doesn't mean all the methods in it are open. So we define open separately.
    //abstract keyword is used when we only want to declare the method not body.
    abstract fun think()
    fun talk(){
        println("human talking")
    }
}

//whenever we inherit we have to make sure that we use constructor of the inherited class.
class Alien1: Human1() {


    //we use override keyword bcoz we r overriding the constructor.
    override fun think(){
        println("in class Alien think()")
    }
}

class Doctor : Human1(){
    override fun think() {
        println("Doctor Thinking")
    }
}
fun main(args : Array<String>){

    val h = Alien1()
    h.think()
    h.talk()
    println("******")
    //reference of Human and object of Alien
    val h1: Human1 = Alien1()
    h1.think()
}