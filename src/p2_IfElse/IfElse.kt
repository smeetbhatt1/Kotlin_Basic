package p2_IfElse

/*
Created by smeetbhatt on 20/09/17
*/


fun main(args : Array<String>){
    //IF_ELSEIF_IF
    println("****************")
    var i1 : Int = 2
    var i2 : Int = 2
    var rr = if(i1 > i2)
        i1
    else if(i2 > i1)
        i2
    else
        "Both equal"
    println("(IF-ELSEIF-ELSE)Greater number is $rr")
}