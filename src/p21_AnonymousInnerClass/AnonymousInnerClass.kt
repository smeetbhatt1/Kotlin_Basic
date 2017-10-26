package p21_AnonymousInnerClass


/*
Created by smeetbhatt, 
on 26/10/17
*/

//ANONYMOUS INNER CLASS:::: we use keyword object


interface Human {
    fun think()
}

fun main(args : Array<String>){

    var h1 : Human = object : Human
                    {
                        override fun think(){
                            println("Anonymous inner class")
                        }
                    }

    h1.think()
}