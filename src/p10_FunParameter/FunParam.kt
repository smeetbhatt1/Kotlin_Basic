package p10_FunParameter

/*
Created by smeetbhatt on 25/09/17
*/


fun main(args : Array<String>){
    var i = calAmount(50, 0.06 )            //it will use 0.06 for interent in function.And we can change the sequence called namedParameters.
    println(i)

    var j = calAmount(50 )          //it will use default 0.04 in function.
    println(j)
}

//Instead of creating different function i.e., default and named parameters.
//We can combine both like given as below.
//Note: Cannot be used in java class but we can achieve by using @JvmOverloads.

@JvmOverloads                   //will enable single value paramenter when its called in java class
fun calAmount(amt : Int, interest : Double = 0.04) : Int {
    return (amt + amt*interest).toInt()
}