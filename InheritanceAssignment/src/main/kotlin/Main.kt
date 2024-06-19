fun main() {
    val car = Car("Subaru","legacy","white",7)
   car.carry(10)
   car.identity()
    car.calculateParkingFees(1)

    val bus = Bus("Scania","A","Black",80)
   bus.carry(80)
    bus.identity()
    bus.calculateParkingFees(1)
    bus.maxTrip(100.00)

}
open class Vehicle (var make:String, var model: String,var color:String,var capacity: Int){
    fun carry(people:Int){
        val x = people - capacity
        if(people <= capacity){
            println("Carrying $people passengers")
        }
        else{
            println("Over capacity by $x people")
        }
    }
    fun identity(){
        println("I am a $color $make $model")
    }
   open fun calculateParkingFees(hours:Int):Int{
        val parkingFees = hours * 20
       println(parkingFees)
        return parkingFees
    }


}
class Car(make:String,model: String,color:String,capacity: Int): Vehicle (make,model,color,capacity){

}
class Bus (make:String,model: String,color:String,capacity: Int): Vehicle (make,model,color,capacity){

    fun maxTrip(fare:Double):Double{
        val maxfare = capacity * fare
        println(maxfare)
        return maxfare

    }
   override fun calculateParkingFees(hours:Int):Int{
       val parkingFees = hours * capacity
       println(parkingFees)
       return parkingFees
    }


}

