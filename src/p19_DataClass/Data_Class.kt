package p19_DataClass


/*
Created by smeetbhatt, 
on 26/10/17
*/


// 1. Every class needs a toString.
// 2. equals and hashCode
// 3. copy()

data class Laptop(val brand: String, val price: Int) {

    fun show(){
        println("in show() in laptop class")
    }
}




fun main(args: Array<String>){
    var l1 = Laptop("Dell",1200)
    var l2 = Laptop("Apple",2000)

    var l3 = l1.copy()
    var l4 = l1.copy(price = 2200)
    println(l1)         //p19_DataClass.Laptop@1ae369b7 class name with address.
    println("******")
    println(l1.equals(l2))
    println("******")
    println(l3)
    println("******")
    println(l4)
}