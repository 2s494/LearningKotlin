package ObjectOrientedProgramming.override

open class Vehicle {
   open fun start(){
        println("Vehicle has started")
    }
    open fun accelerate(){
        println("Vehicle Accelerates at")
    }

    open fun stop(){
        println("Vehicle has Stopped")
    }
}