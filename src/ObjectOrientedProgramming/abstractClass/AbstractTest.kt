package ObjectOrientedProgramming.abstractClass

fun main(args : Array<String>){
    var car = Car(2021)

    car.speed = 300

    println("Name : ${car.vehicleName("Ferrari")}\n Model : ${car.model} \n Speed : ${car.speed}")
}