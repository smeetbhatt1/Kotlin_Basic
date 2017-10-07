package p7_Loop

/*
Created by smeetbhatt on 25/09/17
*/


fun main(args : Array<String>){
    var nums1 = 1..15
    println("Printing numbers with gap of 3")
    for(a in nums1 step 3){          //step keyword will act as difference in sequence of number.
        println(a)
    }

    println("****************")
    println("Printing in descending")
    var nums2 = 5 downTo 1         // is equivalent to "5.downTo(1)" downTO keyword will act as descending order.
    for (a in nums2){
        println(a)
    }

    println("****************")
    println("Printing less than 5.. using keyword until")
    var nums3 = 1 until 5         // until keyword is used when we want values less than specific value.
    for (a in nums3){
        println(a)
    }

    println("****************")
    println("Printing less than 5.. using keyword until && reverse way")
    var nums4 = 1 until 5         // until keyword is used when we want values less than specific value.
    for (a in nums4.reversed()){
        println(a)
    }

    //When we cmd+click or ctrl+click on reversed(), there are many functions which are included in class Ranges.
    println("****************")
    println("nums2.count() will return ${nums2.count()}");

    println("****************")
    println("Printing A..z ASCII ")
    var nums5 = 'A'..'z'         // until keyword is used when we want values less than specific value.
    for (a in nums5){
        println(a)
    }
}