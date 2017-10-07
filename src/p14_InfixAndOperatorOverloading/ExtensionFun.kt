package p14_ExtensionFun

/*
Created by smeetbhatt on 25/09/17
*/


fun main(args : Array<String>){
    var v1 = Test()
    v1.skills = "Java"
    v1.show()

    var v2 = Test()
    v2.skills = "MySql"
    v2.show()

    var v3 = v1.plus(v2)
    v3.show()

    var v4 = v3 plus v2
    v4.show()

    var v5 = v4 + v2
    v5.show()
}

//Extension Function which are those are function which are linked externally but no internally to the class.
//example is given below.

//infix will allow u to write keyword between variables eg. "v1 plus v2"     instead of v1.plus(v2)
//Infix onlt take one parameter

//Using keyword operator we can simply use v1+v2 instead of vi.plus(v2).
operator infix fun Test.plus(a : Test) : Test{
    var b = Test()
    b.skills = this.skills + " " + a.skills;
    return b
}