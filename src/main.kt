fun main() {
    var car = Car("Audi", "A5", "silver", 4)
    car.carry(4)
    car.identity()
    car.calculateParkingFees(10)
    var bus =Bus("scania","Isuzu","yellow",50)
    bus.maxTripFare(100.00)
    bus.calculateParkingFees(20)


}

open class Car(var make: String, var model: String, var color: String, var capacity: Int) {
    fun carry(people: Int) {
        var x = people - capacity
        if (people <= capacity) {
            println("carrying $people passengers")
        } else {
            println("carrying exceeding $x capacity")
        }
    }
    fun identity (){
        println("I am a $color $make $model")
    }
    open fun calculateParkingFees(hours:Int):Int{
        var Fees = hours*20
        return Fees
    }
}
    class Bus (make: String, model: String, color: String, capacity: Int):Car(make,model,color,capacity){
       fun maxTripFare(fare:Double):Double{
       var maxFare = fare*capacity
           println(maxFare)
           return  maxFare
       }
        override fun calculateParkingFees(hours: Int):Int{
            var fees = hours*capacity
            println(fees)
            return fees
        }
    }