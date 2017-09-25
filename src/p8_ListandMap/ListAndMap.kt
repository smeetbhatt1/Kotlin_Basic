package p8_ListandMap

import java.util.*
import kotlin.collections.HashMap

/*
Created by smeetbhatt on 25/09/17
*/


fun main(args : Array<String>){

    println("List")
    var num1 = listOf(1,0,6,4,7,8,3,3)
    for( (i,e) in num1.withIndex()){
        println("Index $i : Value $e")
    }

    println("****************")
    println("TreeMap")
    var student = TreeMap<String,Int>();
    student["Smeet"] = 101
    student["krupa"] = 102
    student["vaishvik"] = 103
    for( (name,id) in student){
        println("name $name $\t: ID $id")
    }

    println("****************")
    println("HashMap")
    var emp = HashMap<String,Int>();
    emp["Sagar"] = 201
    emp["Kartey"] = 202
    emp["Khushbhu"] = 203
    for( (name,id) in emp){
        println("name $name $\t: ID $id")
    }
}