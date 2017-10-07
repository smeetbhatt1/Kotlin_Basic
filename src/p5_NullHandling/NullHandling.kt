package p5_NullHandling

/*
Created by smeetbhatt on 20/09/17
*/


fun main(args : Array<String>){

    //Kotlin will handle your null values properly
    //NullPointerException

    //By default we are not allowed to assign null Value to object

    /*
    An Error occurs "Null can not be a value of a non-null type String"
    i.e., if we define a String as datatype by default is NOT null
    */
   // var str1 : String = null //will throw error (remove comment and we see error)

    //In case if we want to assign null value to object then put `?` after String/Datatype
    var str2 : String? = null
    println("value of null_string ${str2}")
    println("Length of null_string ${str2?.length}") //o/p will be null only
}