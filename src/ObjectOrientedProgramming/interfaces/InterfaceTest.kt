package ObjectOrientedProgramming.interfaces

fun main(){
    var vehicle = Vehicle()
    println("Name : ${vehicle.name}")

    vehicle.go()
    vehicle.stop()
}