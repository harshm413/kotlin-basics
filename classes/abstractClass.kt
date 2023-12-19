abstract class Vehicle(
    brand:String,
    model:String,
    year:Int
){
    public var brand:String=""
    protected var model:String=""
    private var year:Int=0

    init{
        this.brand=brand
        this.model=model
        this.year=year
    }

    public abstract fun startEngine()

    public fun getInfo():String{
        return "$brand $model $year"
    }

}

class Car(
    brand:String,
    model:String,
    year:Int,
    numberOfDoors:Int
):Vehicle(brand,model,year){
    public var numberOfDoors:Int=0

    init{
        this.numberOfDoors=numberOfDoors
    }

    override
    public fun startEngine(){
        println("Car engine started.")
    }

    public fun getModel(){
        println("$model")
    }
}

fun main(){
    var myCar:Car=Car("Toyota","Camry",2022,4)
    myCar.getModel()
    println(myCar.brand)
    //println(myCar.model)
    //println(myCar.year)

    println(myCar.getInfo())
    myCar.startEngine()
}