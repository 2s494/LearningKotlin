package ObjectOrientedProgramming.override

fun main(){
    var vehicle = Vehicle()

    vehicle.start()
    vehicle.accelerate()
    vehicle.stop()

    var car = Car()
    car.start()
    car.accelerate()
    car.stop()
}