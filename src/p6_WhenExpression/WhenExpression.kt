package p6_WhenExpression

/*
Created by smeetbhatt on 25/09/17
*/


fun main(args : Array<String>){
    var num : Int = 2

    when(num){
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        5 -> println("Five")
        else -> println("Wrong Input")
    }
    println("****************")
    var num1 : Int = 3
    var str = when(num1){
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        else -> "Wrong Input"
    }
    println(str)
}