fun main(){

    // immutable Map

    var age = mapOf<String,Int>("David" to 20,"Ronaldo" to 7) // O'zgarmas Map

    println("number of David is ${age["David"]}")

    println("number of Ronaldo is ${age["Ronaldo"]}")


    age.get("David")

    // mutable Map
    var mutableMap = mutableMapOf<String,Int>() // O'zgaruvchan Map

    mutableMap["Kotlin"] = 2
    println(mutableMap)



}