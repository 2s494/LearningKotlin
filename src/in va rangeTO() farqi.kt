/*
.rangeTo() - diapazon yaratish uchun ishlatiladi:
val range1 = 1.rangeTo(10)  // 1 dan 10 gacha diapazon
val range2 = 1..10          // Xuddi shu narsa (.. operatori)
 */


/*

in - elementning diapazonda yoki kolleksiyada borligini tekshirish uchun:

val range = 1..10
val exists = 5 in range  // true
val notExists = 15 in range  // false

 */


fun main(){
    // rangeTo - diapazon kerak bo'lganda
    for (i in 1..5) {  // 1, 2, 3, 4, 5
        println(i)
    }

    val numbers = 1.rangeTo(100).step(10)  // 1, 11, 21, ...

// in - tekshirish kerak bo'lganda
    val score = 85
    when (score) {
        in 90..100 -> println("A'lo")
        in 80..89 -> println("Yaxshi")
        in 70..79 -> println("Qoniqarli")
        else -> println("Qoniqarsiz")
    }
}