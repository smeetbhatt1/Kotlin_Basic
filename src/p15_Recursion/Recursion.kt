package p15_Recursion

import java.math.BigInteger

/*
Created by smeetbhatt on 25/09/17
*/


//Recursion is a function which class itself.

fun main(args : Array<String>){


    //BigInteger is used for numbers that contains more digits.
   var num = BigInteger("70000 ")
    println(fact(num, BigInteger.ONE))
}

//tailrec keyword stands for tail recursion.
tailrec fun fact(num : BigInteger, result : BigInteger) : BigInteger{

    if (num == BigInteger.ZERO)
        return result
    else
        return fact(num - BigInteger.ONE, num * result)
}