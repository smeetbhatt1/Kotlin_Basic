@file:JvmName("ktclass")                //instead of actual class name, we can use this class name.
package p9_FunctionExpression

/*
Created by smeetbhatt on 25/09/17
*/


fun main(args : Array<String>){
    var result = add(10,3)
    println("Addition is : "+result)

    println("Greater number is : " + max(13,55))
}

fun add(a : Int, b : Int) : Int{
    return a+b
}

fun max(a : Int,b : Int) : Int = if(a>b) a else b // we can write in one line only