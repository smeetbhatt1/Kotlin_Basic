package p4_StringComparison

/*
Created by smeetbhatt on 20/09/17
*/


fun main(args : Array<String>){
    //String Comparison
    var str1 : String = "Smeet"
    var str2 : String = "Smeet"

    //Comparison of String with ignoring case
    if(str1.equals(str2,true))
        println("Same Strings with ignoring case")
    else
        println("Different Strings with ignoring case")


    println("****************")
    //Comparison of String, by default ignoreCase is false.
    if(str1.equals(str2))
        println("Same Strings with ignoring case")
    else
        println("Different Strings with ignoring case")

    println("****************")
    //Comparison of String, by default ignoreCase is false.
    if(str1 == str2)
        println("Same Strings with ==")
    else
        println("Different Strings with ==")

}