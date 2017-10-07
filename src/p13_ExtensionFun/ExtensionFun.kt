package p13_ExtensionFun

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
}

//Extension Function which are those are function which are linked externally but no internally to the class.
//example is given below.
fun Test.plus(a : Test) : Test{
    var b = Test()
    b.skills = this.skills + " " + a.skills;
    return b
}