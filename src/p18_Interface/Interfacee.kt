package p18_Interface


/*
Created by smeetbhatt, 
on 26/10/17
*/

interface A{
    fun showA()
    fun abc(){
        println("in A abc")
    }
}

interface B{
    fun showB()
    fun abc(){
        println("in B abc")
    }
}

class C : A,B {
    override fun showA() {
        println("in C show A")
    }

    override fun showB() {
        println("in C show B")
    }
    override fun abc(){
        //to print abc() in B
        super<B>.abc()
    }
}
fun main(args: Array<String>){
    val c = C()
    c.showA()
    c.showB()
    c.abc()
}