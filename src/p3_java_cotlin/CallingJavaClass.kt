package p3_java_cotlin

/*
Created by smeetbhatt on 20/09/17
*/


fun main(args : Array<String>){
    //Calling java_cotlin.Student class from java file.
    println("****************")
    var i = Student()                                   //No need to write "new java_cotlin.Student()"
    i.name = "Smeet"                                    //Instead of i = setName("Smeet") we csn write i.name = "Smeet"
    println("Displaying from other class $i.name")      //without {} will take only i so we use {} will display random value
    println("Displaying from other class ${i.name}")

}