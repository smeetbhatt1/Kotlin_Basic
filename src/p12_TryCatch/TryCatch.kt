package p12_TryCatch

/*
Created by smeetbhatt on 25/09/17
*/


fun main(args : Array<String>){
    var str : String = "12"
    var i : Int = try{
        str.toInt()
    }
    catch(e : Exception){
        -1
    }

    println(++i)

}