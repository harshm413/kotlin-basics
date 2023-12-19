interface MyInterface{
    fun doSomething()
    fun doAnotherThing()
    fun calculateSum(a:Int,b:Int):Int
}

class MyClass:MyInterface{
    override
    fun doSomething(){
        println("Doing something...")
    }
    override
    fun doAnotherThing(){
        println("Doing another thing...")
    }
    override
    fun calculateSum(a:Int,b:Int):Int{
        return a+b
    }
    //override is must in kotlin class and interface
}
fun main(){
    var myObj:MyClass=MyClass()
    myObj.doSomething()
    myObj.doAnotherThing()

    println(myObj.calculateSum(5,10))
}