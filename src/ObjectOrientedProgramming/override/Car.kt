package ObjectOrientedProgramming.override

class Car : Vehicle() {
    override fun start(){
        println("Car has started")
    }
    override fun accelerate(){
        println("Car Accelerates at")
    }

    override fun stop(){
        println("Car has Stopped")
    }

}