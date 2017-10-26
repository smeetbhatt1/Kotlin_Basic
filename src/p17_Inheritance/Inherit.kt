package p17_Inheritance

/*
we use open keyword because by default when we define
a class in kotlin its final type. So inheritance is not possible,
to make inheritance possible please use open keyword.
*/
open class Human(age: Int) {

    init {
        println("In human $age")
    }

    //we use open keyword in class that doesn't mean all the methods in it are open. So we define open separately.
    open fun think(){
        println("in class Human think()")
    }
}

//whenever we inherit we have to make sure that we use constructor of the inherited class.
class Alien(age: Int) : Human(age) {

    //first super class constructor is called.
    init {
        println("In Alien")
    }
    //we use override keyword bcoz we r overriding the constructor.
    override fun think(){
        println("in class Alien think()")
    }
}
fun main(args : Array<String>){

    val h = Alien(5)
    h.think()

    //reference of Human and object of Alien
    val h1: Human = Alien(6)
    h1.think()
}