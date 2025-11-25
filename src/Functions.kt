fun main(){

    var num1  = readLine()!!
    var num2 = readLine()!!

    showTwoNumbers(num1.toInt(), num2.toInt())
    var result = addTwoNumbers(num1.toInt(), num2.toInt())

    println("Result: $result")
}
fun showTwoNumbers(num1: Int, num2: Int) : Unit {
    println("You intered $num1 and $num2")
}

fun addTwoNumbers(num1: Int, num2: Int) : Int {
    println(num1 + num2)
    return num1 + num2
}


