fun main(){
    var age = arrayOf(1,2,3,4)

    println("First element is ${age[0]}") // -> 1
    println("Second element is " + age.get(1)) // -> 2

    println("Array o'lchami : ${age.size}")
    /*

    Konseptual jihatdan ha,
     o'xshash, lekin Dart'dagi List ko'proq imkoniyatlarga ega (dynamic size, ko'proq metodlar).
      Kotlin'dan Flutter'ga o'tayotgan bo'lsangiz, arrayOf() ni List sifatida tasavvur qilishingiz mumkin,
       faqat Dart'da List'lar ko'proq moslashuvchan ekanini esda tuting.
     */
}