/*

arrayListOf<T>() - funksiya - Bu ArrayList yaratadigan funksiya
Darhol elementlar bilan to'ldirishingiz mumkin
--------------------------------------------------------------------
ArrayList<T>() - konstruktor - Bu ArrayList klassining konstruktori
Bo'sh ro'yxat yaratadi (yoki boshlang'ich sig'imni belgilaysiz)
--------------------------------------------------------------------
 */

fun main(){
    var age = ArrayList<Int>()

    age.add(10) // element qo'shish

    age.add(1,15) // index bo'yicha element qo'shish

    age.add(20)


    println("First element of ArrayList = ${age.first()}")
    println("Second element of ArrayList = ${age[1]}")
    println(" Elements of ArrayList = ${age}")


    println(age.size) // o'lchami


    age.remove(15) // O'chirish

    println(age)

    var myMixArrayList = ArrayList<Any>() // Istalgan turni o'z ichiga olishi uchun array list hosil qilish

    myMixArrayList.add(1)
    myMixArrayList.add("BMW")
    myMixArrayList.add(false)
    myMixArrayList.add('A')
    myMixArrayList.add(2.5)

    println(myMixArrayList)
}